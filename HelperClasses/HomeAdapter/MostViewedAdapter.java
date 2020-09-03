package com.girishkumar032.cityguide.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.girishkumar032.cityguide.R;

import java.util.ArrayList;

public class MostViewedAdapter extends RecyclerView.Adapter<MostViewedAdapter.MostViewedViewHolder> {

    ArrayList<MosViewedhelperClass>mostViewedLocation;

    public MostViewedAdapter(ArrayList<MosViewedhelperClass> mostViewedLocations) {
        this.mostViewedLocation=mostViewedLocations;
    }

    @NonNull
    @Override
    public MostViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed_card_design,parent,false);
        MostViewedViewHolder mostViewedViewHolder=new MostViewedViewHolder(view);
        return mostViewedViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull MostViewedViewHolder holder, int position) {
        MosViewedhelperClass helperclass=mostViewedLocation.get(position);

        holder.imageView.setImageResource(helperclass.getImageView());
        holder.textView.setText(helperclass.getTextView());
    }


    @Override
    public int getItemCount() {
        return mostViewedLocation.size();
    }


    public static class MostViewedViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;

        public MostViewedViewHolder(@NonNull View itemView){
            super(itemView);

            imageView=itemView.findViewById(R.id.mv_image);
            textView=itemView.findViewById(R.id.mv_title);
        }

    }
}
