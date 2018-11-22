package com.example.omar.recyclerview_training;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class Main2Activity extends RecyclerView.Adapter<Main2Activity.ViewHolder> {
   private LayoutInflater mlayoutinflater;
   Context context;
   private ArrayList<Model> marraylist;
    public Main2Activity (Context context, ArrayList<Model> marraylist){
        this.context = context;
        this.marraylist = marraylist;

    }
    @NonNull
    @Override
    public Main2Activity.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        return new ViewHolder(mlayoutinflater.inflate(R.layout.activity_main,parent,false));


    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView itext;
        RelativeLayout mrelativelayout;

        ViewHolder(View itemView) {
            super(itemView);
            itext = itemView.findViewById(R.id.textview_id);

        }
    }

    @Override
    public void onBindViewHolder( final ViewHolder holder,final int position) {
        Model data = marraylist.get(position);
        holder.itext.setText(data.getName());

    }

    @Override
    public int getItemCount() {
        return (marraylist == null) ? 0 : marraylist.size();
    }


}