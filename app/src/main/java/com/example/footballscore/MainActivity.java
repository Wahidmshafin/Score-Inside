package com.example.footballscore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity
{
    final static String TAG="ERROR";
    private RecyclerView recycler_league;

    private void init()
    {
        recycler_league=findViewById(R.id.main_recycle_League);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        ArrayList<league_list>list=new ArrayList<>();
        list.add(new league_list("EPL", R.drawable.eplorigin,237));
        list.add(new league_list("Serie A",R.drawable.seriea,392));
        league_list_adapter adapter=new league_list_adapter(this);
        adapter.setLeagueLists(list);
        recycler_league.setAdapter(adapter);
        recycler_league.setLayoutManager(new GridLayoutManager(this,1));

    }
}