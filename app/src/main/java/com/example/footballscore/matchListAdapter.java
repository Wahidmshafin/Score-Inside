package com.example.footballscore;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class matchListAdapter extends RecyclerView.Adapter<matchListAdapter.ViewHolder>
{
    private ArrayList<matchList.Datum> list=new ArrayList<>();
    private Context context;
    public matchListAdapter(Context context)
    {
        this.context=context;
    }

    public void setList(ArrayList<matchList.Datum> list)
    {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.fixture_adapter_layout,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        String home_logo=list.get(position).getHomeTeam().getLogo();
        String away_logo=list.get(position).getAwayTeam().getLogo();
        Log.e("logo", "onBindViewHolder: "+home_logo );
        Picasso.with(context).load(home_logo).into(holder.img_home);
        Picasso.with(context).load(away_logo).into(holder.img_away);
        holder.txt_home_name.setText(list.get(position).getHomeTeam().getName());
        holder.txt_away_name.setText(list.get(position).getAwayTeam().getName());
        String[] time=list.get(position).getMatchStart().split(" ");
        holder.txt_date.setText(time[0]);
        holder.txt_time.setText(time[1]);
        Integer status_code= list.get(position).getStatusCode();
        if(status_code.equals(3))
        {
            holder.txt_score.setText(list.get(position).getStats().getHomeScore()+" - "+list.get(position).getStats().getAwayScore());
        }
        else if(status_code.equals(0))
        {
            holder.txt_score.setText("Not Started");
        }
        else
        {
            holder.txt_score.setText(list.get(position).getStatus());
        }
        Integer matchId=list.get(position).getMatchId();
        holder.constraintLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent =new Intent(context,matchStatusActivity.class);
                intent.putExtra("matchId",matchId);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private ImageView img_home,img_away;
        private TextView txt_home_name,txt_away_name,txt_score,txt_date, txt_time;
        private ConstraintLayout constraintLayout;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            img_home=itemView.findViewById(R.id.fixture_img_home);
            img_away=itemView.findViewById(R.id.fixture_img_away);
            txt_home_name=itemView.findViewById(R.id.fixture_txt_home);
            txt_away_name=itemView.findViewById(R.id.fixture_txt_away);
            txt_score=itemView.findViewById(R.id.fixture_txt_result);
            txt_date=itemView.findViewById(R.id.fixture_txt_date);
            txt_time=itemView.findViewById(R.id.fixture_txt_time);
            constraintLayout=itemView.findViewById(R.id.fixture_constrain_layout);
        }
    }
}
