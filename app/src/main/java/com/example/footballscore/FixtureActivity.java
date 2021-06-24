package com.example.footballscore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FixtureActivity extends AppCompatActivity
{
    private TextView txt_league;
    private TabLayout tl_layout;
    private TabItem ti_result,ti_fixture,ti_standing;
    private ViewPager2 vp_fragment;
    private final String TAG="ERROR";
    private Spinner spinner;
    FragmentManager fm;
    FixturePageAdapter adapter;
    ArrayAdapter<String>arrayAdapter;
    Integer league_id;
    Retrofit retrofit;
    private PlaceHolderApi holderApi;

    private void Tab(Integer position)
    {
        adapter= new FixturePageAdapter(fm,getLifecycle(),tl_layout.getTabCount());
        Call<SeasonLIst> seasoncall=holderApi.getAllSeasons(api_constant.apikey.getValue(), league_id);
        seasoncall.enqueue(new Callback<SeasonLIst>()
        {
            @Override
            public void onResponse(Call<SeasonLIst> call, Response<SeasonLIst> response)
            {
                if(response.isSuccessful())
                {
                    SeasonLIst list=response.body();
                    adapter.setID(list.getData().get(position).getSeasonId(),list.getData().get(position).getCountryId());
                    vp_fragment.setAdapter(adapter);
                    tl_layout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener()
                    {
                        @Override
                        public void onTabSelected(TabLayout.Tab tab)
                        {
                            vp_fragment.setCurrentItem(tab.getPosition());
                        }

                        @Override
                        public void onTabUnselected(TabLayout.Tab tab)
                        {

                        }

                        @Override
                        public void onTabReselected(TabLayout.Tab tab)
                        {

                        }
                    });
                    vp_fragment.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback()
                    {
                        @Override
                        public void onPageSelected(int position)
                        {
                            tl_layout.selectTab(tl_layout.getTabAt(position));
                        }
                    });
                }
            }

            @Override
            public void onFailure(Call<SeasonLIst> call, Throwable t)
            {

            }
        });

    }

    private void init()
    {
        txt_league=findViewById(R.id.fixture_txt_leaguename);
        tl_layout=findViewById(R.id.fixture_tablayout);
        ti_fixture=findViewById(R.id.fixture_tab_fixture);
        ti_result=findViewById(R.id.fixture_tab_result);
        ti_standing=findViewById(R.id.fixture_tab_standing);
        vp_fragment=findViewById(R.id.fixture_vp_fragment);
        spinner=findViewById(R.id.fixture_spinner_year);
        fm=getSupportFragmentManager();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixture);
        init();
        Intent intent=getIntent();
        league_id= intent.getIntExtra("id",237);
        String league_name=intent.getStringExtra("name");
        txt_league.setText(league_name+" 20");
        Log.e(TAG, "onCreate: "+league_id );
        retrofit=new Retrofit.Builder()
                .baseUrl(api_constant.BaseUrl.getValue())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        holderApi=retrofit.create(PlaceHolderApi.class);

        List<String>seasonlist=new ArrayList<>();
        seasonlist.add("20-21");
        seasonlist.add("19-20");
        seasonlist.add("18-19");
        arrayAdapter=new ArrayAdapter<>(this,R.layout.spinner_list,seasonlist);
        arrayAdapter.setDropDownViewResource(R.layout.spinner_list);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                Tab(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {

            }
        });
    }
}