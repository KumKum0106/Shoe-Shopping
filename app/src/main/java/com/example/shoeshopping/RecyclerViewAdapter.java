package com.example.shoeshopping;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

     ArrayList<RecyclerData> shoeDataArrayList;
     Context mContext;

    public RecyclerViewAdapter(ArrayList<RecyclerData> recyclerDataArrayList, Context mContext){
        this.shoeDataArrayList = recyclerDataArrayList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RecyclerViewHolder holder, int position) {

        RecyclerData recyclerData = shoeDataArrayList.get(position);
        holder.shoeNameTV.setText(recyclerData.getShoeName());
        holder.shoePriceTV.setText(String.valueOf(recyclerData.getPrice()));
        holder.shoeRatingTV.setText(String.valueOf(recyclerData.getRating()));
        holder.shoeImg.setImageResource(recyclerData.getImgId());

    }

    @Override
    public int getItemCount() {
        return shoeDataArrayList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{
         TextView shoeNameTV, shoePriceTV, shoeRatingTV;
         ImageView shoeImg;

        public RecyclerViewHolder(View itemView){
            super(itemView);
            shoeNameTV = itemView.findViewById(R.id.item_name);
            shoePriceTV = itemView.findViewById(R.id.item_price);
            shoeRatingTV = itemView.findViewById(R.id.image_points);
            shoeImg = itemView.findViewById(R.id.grid_image);
        }
    }
}
