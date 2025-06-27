package com.example.myapplication4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.SportViewHolder> {

    List<Sport> sportList;

    public SportAdapter(List<Sport> sportList) {
        this.sportList = sportList;
    }

    public static class SportViewHolder extends RecyclerView.ViewHolder {
        ImageView imgSport;
        TextView txtSportName;

        public SportViewHolder(View itemView) {
            super(itemView);
            imgSport = itemView.findViewById(R.id.imgSport);
            txtSportName = itemView.findViewById(R.id.txtSportName);
        }
    }

    @NonNull
    @Override
    public SportViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sport_card, parent, false);
        return new SportViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SportViewHolder holder, int position) {
        Sport sport = sportList.get(position);
        holder.imgSport.setImageResource(sport.getImageResId());
        holder.txtSportName.setText(sport.getName());
    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }
}

