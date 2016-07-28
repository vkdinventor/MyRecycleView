package com.vikash.example.myrecycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by einfochips on 28/7/16.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView textviewheader;
        TextView textViewfooter;
        public ViewHolder(View itemView) {
            super(itemView);
            textviewheader=(TextView)itemView.findViewById(R.id.textViewm);
            textViewfooter=(TextView)itemView.findViewById(R.id.textViews);
        }
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.textviewheader.setText("Medium: "+position);
        holder.textViewfooter.setText("Small: "+position);
    }
}
