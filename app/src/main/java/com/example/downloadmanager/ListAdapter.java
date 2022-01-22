package com.example.downloadmanager;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> Data;
    private LayoutInflater myinflater;
    private Context context;

    public ListAdapter(List<ListElement> itemList, Context context){
        this.myinflater = LayoutInflater.from(context);
        this.context= context;
        this.Data = itemList;
    }

    @Override
    public int getItemCount(){return Data.size();}

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = myinflater.inflate(R.layout.listelement, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
        holder.bindData(Data.get(position));
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView fichero,fecha;
        ImageView iconImage;

        ViewHolder(View itemView){
            super(itemView);
            fichero = itemView.findViewById(R.id.txtfichero);
            fecha = itemView.findViewById(R.id.txtdate);
            iconImage = itemView.findViewById(R.id.iconimageview);
        }

        void bindData(final ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            fichero.setText(item.getFichero());
            fecha.setText(item.getFecha());
        }
    }
}
