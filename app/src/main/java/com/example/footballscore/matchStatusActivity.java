package com.example.footballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.IOException;

import okhttp3.Request;
import okio.Timeout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class matchStatusActivity extends AppCompatActivity
{
   private TextView txt_home_possesion,txt_home_pass,txt_home_shots,txt_home_ontarget,txt_home_freekick,txt_home_corners,
            txt_home_offside,txt_home_fouls,txt_home_yellow,txt_home_red, txt_away_possesion,txt_away_pass,txt_away_shots,txt_away_ontarget,txt_away_freekick,txt_away_corners,
            txt_away_offside,txt_away_fouls,txt_away_yellow,txt_away_red,txt_score;
   private TextView txt_home,txt_away,txt_venue, txt_time;
   private ImageView img_home, img_away;
    private ProgressBar pgb_home_possesion,pgb_home_pass,pgb_home_shots,pgb_home_ontarget,pgb_home_freekick,pgb_home_corners,
            pgb_home_offside,pgb_home_fouls,pgb_home_yellow,pgb_home_red, pgb_away_possesion,pgb_away_pass,pgb_away_shots,pgb_away_ontarget,pgb_away_freekick,pgb_away_corners,
            pgb_away_offside,pgb_away_fouls,pgb_away_yellow,pgb_away_red;
    Retrofit retrofit;
    PlaceHolderApi holderApi;
    matchstatus status;
    private void init()
    {
        txt_score=findViewById(R.id.status_txt_score);
        txt_home_possesion=findViewById(R.id.status_txt_home_possesion);
        txt_home_corners=findViewById(R.id.status_txt_home_corners);
        txt_home_fouls=findViewById(R.id.status_txt_home_fouls);
        txt_home_pass=findViewById(R.id.status_txt_home_pass);
        txt_home_shots=findViewById(R.id.status_txt_home_shots);
        txt_home_ontarget=findViewById(R.id.status_txt_home_ontarget);
        txt_home_freekick=findViewById(R.id.status_txt_home_freekick);
        txt_home_offside=findViewById(R.id.status_txt_home_offside);
        txt_home_yellow=findViewById(R.id.status_txt_home_yellow);
        txt_home_red=findViewById(R.id.status_txt_home_red);
        txt_away_possesion=findViewById(R.id.status_txt_away_possesion);
        txt_away_pass=findViewById(R.id.status_txt_away_pass);
        txt_away_corners=findViewById(R.id.status_txt_away_corners);
        txt_away_fouls=findViewById(R.id.status_txt_away_fouls);
        txt_away_shots=findViewById(R.id.status_txt_away_shots);
        txt_away_ontarget=findViewById(R.id.status_txt_away_ontarget);
        txt_away_freekick=findViewById(R.id.status_txt_away_freekick);
        txt_away_offside=findViewById(R.id.status_txt_away_offside);
        txt_away_yellow=findViewById(R.id.status_txt_away_yellow);
        txt_away_red=findViewById(R.id.status_txt_away_red);
        pgb_home_possesion=findViewById(R.id.status_pgb_home_possesion);
        pgb_home_corners=findViewById(R.id.status_pgb_home_corners);
        pgb_home_fouls=findViewById(R.id.status_pgb_home_fouls);
        pgb_home_pass=findViewById(R.id.status_pgb_home_pass);
        pgb_home_shots=findViewById(R.id.status_pgb_home_shots);
        pgb_home_ontarget=findViewById(R.id.status_pgb_home_ontarget);
        pgb_home_freekick=findViewById(R.id.status_pgb_home_freekick);
        pgb_home_offside=findViewById(R.id.status_pgb_home_offside);
        pgb_home_yellow=findViewById(R.id.status_pgb_home_yellow);
        pgb_home_red=findViewById(R.id.status_pgb_home_red);
        pgb_away_possesion=findViewById(R.id.status_pgb_away_possesion);
        pgb_away_pass=findViewById(R.id.status_pgb_away_pass);
        pgb_away_corners=findViewById(R.id.status_pgb_away_corners);
        pgb_away_fouls=findViewById(R.id.status_pgb_away_fouls);
        pgb_away_shots=findViewById(R.id.status_pgb_away_shots);
        pgb_away_ontarget=findViewById(R.id.status_pgb_away_ontarget);
        pgb_away_freekick=findViewById(R.id.status_pgb_away_freekick);
        pgb_away_offside=findViewById(R.id.status_pgb_away_offside);
        pgb_away_yellow=findViewById(R.id.status_pgb_away_yellow);
        pgb_away_red=findViewById(R.id.status_pgb_away_red);
        txt_home=findViewById(R.id.status_txt_home);
        txt_away=findViewById(R.id.status_txt_away);
        txt_venue=findViewById(R.id.status_txt_venue);
        img_home=findViewById(R.id.status_img_home);
        img_away=findViewById(R.id.status_img_away);
        txt_time=findViewById(R.id.status_txt_time);
    }


    static final String TAG="ERROR";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match_status);
        Intent intent =getIntent();
        Integer matchID=intent.getIntExtra("matchId",36748);
        Log.e(TAG, "onCreate: "+matchID );
        init();
        retrofit=new Retrofit.Builder().baseUrl(api_constant.BaseUrl.getValue())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        holderApi=retrofit.create(PlaceHolderApi.class);
        Call<matchstatus>call= holderApi.getMatchInfo(matchID,api_constant.apikey.getValue());
        call.enqueue(new Callback<matchstatus>()
        {
            @Override
            public void onResponse(Call<matchstatus> call, Response<matchstatus> response)
            {
                status=response.body();
                String[] time=status.getData().getMatchStart().split(" ");
                txt_time.setText(time[0]);
                txt_score.setText(status.getData().getStats().getFtScore());
                txt_home.setText(status.getData().getHomeTeam().getName());
                txt_away.setText(status.getData().getAwayTeam().getName());
                txt_venue.setText(status.getData().getVenue().getName());
                Picasso.with(matchStatusActivity.this).load(status.getData().getHomeTeam().getLogo()).into(img_home);
                Picasso.with(matchStatusActivity.this).load(status.getData().getAwayTeam().getLogo()).into(img_away);
                Integer home_attack =status.getData().getMatchStatistics().get(0).getSubstitutions();
                Integer away_attack =status.getData().getMatchStatistics().get(1).getSubstitutions();
                Integer home_goal_attempts =status.getData().getMatchStatistics().get(0).getGoalAttempts();
                Integer away_goal_attempts =status.getData().getMatchStatistics().get(1).getGoalAttempts();
                Integer home_shots =status.getData().getMatchStatistics().get(0).getShotsTotal();
                Integer away_shots =status.getData().getMatchStatistics().get(1).getShotsTotal();
                Integer home_ontarget =home_shots - status.getData().getMatchStatistics().get(0).getShotsOffTarget();
                Integer away_ontarget =away_shots - status.getData().getMatchStatistics().get(1).getShotsOffTarget();
                Integer home_freekick =status.getData().getMatchStatistics().get(0).getFreeKick();
                Integer away_freekick =status.getData().getMatchStatistics().get(1).getFreeKick();
                Integer home_corners =status.getData().getMatchStatistics().get(0).getCorners();
                Integer away_corners =status.getData().getMatchStatistics().get(1).getCorners();
                Integer home_offside =status.getData().getMatchStatistics().get(0).getOffsides();
                Integer away_offside =status.getData().getMatchStatistics().get(1).getOffsides();
                Integer home_fouls =status.getData().getMatchStatistics().get(0).getFouls();
                Integer away_fouls =status.getData().getMatchStatistics().get(1).getFouls();
                Integer home_yellow =status.getData().getMatchStatistics().get(0).getYellowcards();
                Integer away_yellow =status.getData().getMatchStatistics().get(1).getYellowcards();
                Integer home_red =status.getData().getMatchStatistics().get(0).getRedcards();
                Integer away_red =status.getData().getMatchStatistics().get(1).getRedcards();
                txt_home_pass.setText(home_goal_attempts.toString());
                txt_home_possesion.setText(home_attack.toString());
                txt_home_shots.setText(home_shots.toString());
                txt_home_ontarget.setText(home_ontarget.toString());
                txt_home_freekick.setText(home_freekick.toString());
                txt_home_corners.setText(home_corners.toString());
                txt_home_offside.setText(home_offside.toString());
                txt_home_fouls.setText(home_fouls.toString());
                txt_home_yellow.setText(home_yellow.toString());
                txt_home_red.setText(home_red.toString());
                txt_away_pass.setText(away_goal_attempts.toString());
                txt_away_possesion.setText(away_attack.toString());
                txt_away_shots.setText(away_shots.toString());
                txt_away_ontarget.setText(away_ontarget.toString());
                txt_away_freekick.setText(away_freekick.toString());
                txt_away_corners.setText(away_corners.toString());
                txt_away_offside.setText(away_offside.toString());
                txt_away_fouls.setText(away_fouls.toString());
                txt_away_yellow.setText(away_yellow.toString());
                txt_away_red.setText(away_red.toString());
                pgb_home_pass.setProgress(home_goal_attempts);
                pgb_home_possesion.setProgress(home_attack);
                pgb_home_shots.setProgress(home_shots);
                pgb_home_ontarget.setProgress(home_ontarget);
                pgb_home_freekick.setProgress(home_freekick);
                pgb_home_corners.setProgress(home_corners);
                pgb_home_offside.setProgress(home_offside);
                pgb_home_fouls.setProgress(home_fouls);
                pgb_home_yellow.setProgress(home_yellow);
                pgb_home_red.setProgress(home_red);
                pgb_away_pass.setProgress(away_goal_attempts);
                pgb_away_possesion.setProgress(away_attack);
                pgb_away_shots.setProgress(away_shots);
                pgb_away_ontarget.setProgress(away_ontarget);
                pgb_away_freekick.setProgress(away_freekick);
                pgb_away_corners.setProgress(away_corners);
                pgb_away_offside.setProgress(away_offside);
                pgb_away_fouls.setProgress(away_fouls);
                pgb_away_yellow.setProgress(away_yellow);
                pgb_away_red.setProgress(away_red);
                pgb_home_pass.setMax(home_goal_attempts+away_goal_attempts);
                pgb_home_possesion.setMax(home_attack+away_attack);
                pgb_home_shots.setMax(home_shots+away_shots);
                pgb_home_ontarget.setMax(home_ontarget+away_ontarget);
                pgb_home_freekick.setMax(home_freekick+away_freekick);
                pgb_home_corners.setMax(home_corners+away_corners);
                pgb_home_offside.setMax(home_offside+away_offside);
                pgb_home_fouls.setMax(home_fouls+away_fouls);
                pgb_home_yellow.setMax(home_yellow+away_yellow);
                pgb_home_red.setMax(home_red+away_red);
                pgb_away_pass.setMax(home_goal_attempts+away_goal_attempts);
                pgb_away_possesion.setMax(home_attack+away_attack);
                pgb_away_shots.setMax(home_shots+away_shots);
                pgb_away_ontarget.setMax(home_ontarget+away_ontarget);
                pgb_away_freekick.setMax(home_freekick+away_freekick);
                pgb_away_corners.setMax(home_corners+away_corners);
                pgb_away_offside.setMax(home_offside+away_offside);
                pgb_away_fouls.setMax(home_fouls+away_fouls);
                pgb_away_yellow.setMax(home_yellow+away_yellow);
                pgb_away_red.setMax(home_red+away_red);

            }

            @Override
            public void onFailure(Call<matchstatus> call, Throwable t)
            {

            }
        });

    }
}