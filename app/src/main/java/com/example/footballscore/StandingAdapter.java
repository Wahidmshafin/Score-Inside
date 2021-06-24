package com.example.footballscore;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class StandingAdapter extends RecyclerView.Adapter<StandingAdapter.ViewHolder>
{
    final static String TAG="ERROR";
    private ArrayList<standing_list.Standing>list=new ArrayList<>();
    private HashMap<Integer,teamStatus> hashMap;
    public void setList(ArrayList<standing_list.Standing> list, HashMap<Integer,teamStatus> hashMap)
    {
        this.list = list;
        this.hashMap=hashMap;
    }
    Context context;

    public StandingAdapter(Context context)
    {
        this.context=context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_standing_layout,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.txt_position.setText(list.get(position).getPosition().toString());
        holder.txt_match.setText(list.get(position).getOverall().getGamesPlayed().toString());
        holder.txt_win.setText(list.get(position).getOverall().getWon().toString());
        holder.txt_draw.setText(list.get(position).getOverall().getDraw().toString());
        holder.txt_loss.setText(list.get(position).getOverall().getLost().toString());
        holder.txt_gd.setText(list.get(position).getOverall().getGoalsDiff().toString());
        holder.txt_point.setText(list.get(position).getPoints().toString());
        holder.txt_name.setText(hashMap.get(list.get(position).getTeamId()).Name);
        Picasso.with(context).load(hashMap.get(list.get(position).getTeamId()).logo).into(holder.img_logo);
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView txt_position, txt_name, txt_match, txt_win, txt_draw, txt_loss, txt_gd, txt_point;
        ImageView img_logo;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            txt_position=itemView.findViewById(R.id.rec_standing_txt_position);
            txt_name=itemView.findViewById(R.id.rec_standing_txt_name);
            txt_match=itemView.findViewById(R.id.rec_standing_txt_game);
            txt_win=itemView.findViewById(R.id.rec_standing_txt_win);
            txt_draw=itemView.findViewById(R.id.rec_standing_txt_draw);
            txt_loss =itemView.findViewById(R.id.rec_standing_txt_loss);
            txt_gd=itemView.findViewById(R.id.rec_standing_txt_dif);
            txt_point=itemView.findViewById(R.id.rec_standing_txt_point);
            img_logo=itemView.findViewById(R.id.rec_standing_img_logo);

        }
    }
}
