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

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StandingFragment extends Fragment
{
    private RecyclerView rec_standing;
    final static String TAG="ERROR";
    private Integer seasonID;
    private StandingAdapter adapter;
    private Retrofit retrofit;
    private PlaceHolderApi holderApi;
    private Integer countyID;
    standing_list standingList;
    HashMap<Integer,teamStatus > teamMap;
    ArrayList<standing_list.Standing>list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        Bundle bundle=getArguments();
        if(bundle!=null)
        {
            seasonID= bundle.getInt("id");
            countyID=bundle.getInt("countryId");
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_standing, container, false);

    }

    private void showStanding(View view)
    {
        Call<standing_list> call=holderApi.getAllStanding(api_constant.apikey.getValue(), seasonID);
        call.enqueue(new Callback<standing_list>()
        {
            @Override
            public void onResponse(Call<standing_list> call, Response<standing_list> response)
            {
                if(!response.isSuccessful())
                {
                    Log.e(TAG, "onResponse: error ");
                    return;
                }
                rec_standing=view.findViewById(R.id.fragment_rec_standing);
                standingList=response.body();
                list=standingList.getData().getStandings();
                adapter=new StandingAdapter(view.getContext());
                adapter.setList(list,teamMap);
                rec_standing.setAdapter(adapter);
                rec_standing.setLayoutManager(new LinearLayoutManager(view.getContext()));
            }

            @Override
            public void onFailure(Call<standing_list> call, Throwable t)
            {

            }
        });
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        retrofit=new Retrofit.Builder()
                .baseUrl(api_constant.BaseUrl.getValue())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        holderApi=retrofit.create(PlaceHolderApi.class);
        teamMap=new HashMap<>();
        Call<Team>teamCall= holderApi.getTeam(api_constant.apikey.getValue(), countyID);
        teamCall.enqueue(new Callback<Team>()
        {
            @Override
            public void onResponse(Call<Team> call, Response<Team> response)
            {
                if(!response.isSuccessful())
                {
                    return;
                }
                Team  team=response.body();
                for(Team.Datum d:team.getData())
                {
                    teamMap.put(d.getTeamId(),new teamStatus(d.getName(),d.getLogo()));
                }
                showStanding(view);
            }

            @Override
            public void onFailure(Call<Team> call, Throwable t)
            {

            }
        });


    }

}