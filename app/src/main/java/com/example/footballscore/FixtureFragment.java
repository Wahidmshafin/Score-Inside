package com.example.footballscore;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TimeZone;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FixtureFragment extends Fragment
{
    private static final String TAG = "ERROR";
    private Integer season_id;
    private SeasonLIst seasonLIst;
    private matchList matchList;
    private PlaceHolderApi holderApi;
    private Integer status_code;
    private TextView txt_available;
    RecyclerView rec_fixture;
    matchListAdapter adapter;
    ArrayList<matchList.Datum> fixture_list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        Bundle bundle=getArguments();
        if(bundle!=null)
        {
            season_id=bundle.getInt("id");
            status_code=bundle.getInt("status");
            Log.e(TAG, "onCreateView: "+status_code );
        }
        return inflater.inflate(R.layout.fragment_fixture, container, false);

    }

    private void matchcall(View view,Integer seasonID)
    {
        Calendar calendar=Calendar.getInstance(TimeZone.getDefault());
        SimpleDateFormat format=new SimpleDateFormat("YYYY-MM-dd");
        String date= format.format(calendar.getTime());
        Call<matchList>call=holderApi.getAllMatchesFrom(api_constant.apikey.getValue(), seasonID,date);

        call.enqueue(new Callback<matchList>()
        {
            @Override
            public void onResponse(Call<matchList> call, Response<matchList> response)
            {
                if(!response.isSuccessful())
                {
                    Log.e(TAG, "onResponse: Not success");
                    txt_available.setVisibility(View.VISIBLE);
                    return;
                }
                txt_available.setVisibility(View.GONE);
                matchList=response.body();
                rec_fixture=view.findViewById(R.id.frg_fixture_rec);
                adapter=new matchListAdapter(view.getContext());
                fixture_list=matchList.getData();
                adapter.setList(fixture_list);
                rec_fixture.setAdapter(adapter);
                rec_fixture.setLayoutManager(new LinearLayoutManager(view.getContext()));
            }

            @Override
            public void onFailure(Call<matchList> call, Throwable t)
            {
                Log.e(TAG, "onFailure: Failed");
            }
        });
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(api_constant.BaseUrl.getValue())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        holderApi=retrofit.create(PlaceHolderApi.class);
        txt_available=view.findViewById(R.id.fr_result_txt_available);
        matchcall(view,season_id);
    }
}