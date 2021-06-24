package com.example.footballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class SpalshScreenActivity extends AppCompatActivity
{
    private ProgressBar bar;

    private void dowork()
    {
        for(int i=0;i<=100;i=i+10)
        {
           try
           {
               Thread.sleep(200);
               bar.setProgress(i);
           }
           catch (Exception e)
           {
               e.printStackTrace();
           }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh_screen);
        bar=findViewById(R.id.splash_pgb_time);
        Timer timer=new Timer();
        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                dowork();
                Intent intent=new Intent(SpalshScreenActivity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        }).start();
    }
}