package com.vikash.example.myrecycleview;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

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

    Context mContext;
    String[] mSSID;
    MyAdapter(Context context,String[] ssids){
        mContext=context;
        mSSID=ssids;
    }

    @Override
    public int getItemCount() {
        return 50;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem,parent,false);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
                // Get the layout inflater
                LayoutInflater inflater = LayoutInflater.from(mContext);

                // Inflate and set the layout for the dialog
                // Pass null as the parent view because its going in the dialog layout
                builder.setView(inflater.inflate(R.layout.dialog_layout, null));
                builder.setTitle("Connect to WiFi");
                        // Add action buttons
                builder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                // sign in the user ...
                                Toast.makeText(mContext, "Connecting..", Toast.LENGTH_SHORT).show();
                            }
                        });
                builder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(mContext, "Cancled", Toast.LENGTH_SHORT).show();

                            }
                        });
                AlertDialog alertDialog=builder.create();
                alertDialog.show();
            }

        }
    );
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {
        holder.textviewheader.setText(mSSID[position]);
    }
}
