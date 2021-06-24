package com.example.footballscore;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class league_list_adapter extends RecyclerView.Adapter<league_list_adapter.ViewHolder>
{
    ArrayList<league_list> leagueLists=new ArrayList<>();
    Context context;
    Intent intent;
    final String TAG="ERROR";
    public league_list_adapter(Context context)
    {
        this.context=context;
    }

    public void setLeagueLists(ArrayList<league_list> leagueLists)
    {
        this.leagueLists = leagueLists;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.league_list,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull league_list_adapter.ViewHolder holder, int position)
    {
        holder.imgview.setImageResource(leagueLists.get(position).getId());
        intent=new Intent(context,FixtureActivity.class);
        holder.league_list_layout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                intent.putExtra("id",leagueLists.get(holder.getAdapterPosition()).getLeagueID());
                intent.putExtra("name",leagueLists.get(holder.getAdapterPosition()).getName());
                Log.e(TAG, "onClick: "+leagueLists.get(holder.getAdapterPosition()).getLeagueID());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return leagueLists.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgview;
        TextView txt_name;
        ConstraintLayout league_list_layout;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imgview=itemView.findViewById(R.id.league_list_iimgview);
            league_list_layout=itemView.findViewById(R.id.league_list_layout);
        }
    }
}
