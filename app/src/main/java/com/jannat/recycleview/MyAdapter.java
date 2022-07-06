package com.jannat.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


    ArrayList<String> CityNames;
    Context c;



    public MyAdapter(Context c,ArrayList<String>CityNames) {
        this.c=c;
        this.CityNames=CityNames;


    }







    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View v= LayoutInflater.from(c).inflate(R.layout.rowlayout, parent, false);
        MyViewHolder VH=new MyViewHolder(v);

        return VH;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameText.setText(CityNames.get(position));

    }

    @Override
    public int getItemCount() {
        return CityNames.size();
    }
}
