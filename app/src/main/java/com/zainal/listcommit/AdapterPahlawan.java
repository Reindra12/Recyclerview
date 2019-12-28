package com.zainal.listcommit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class AdapterPahlawan extends RecyclerView.Adapter<AdapterPahlawan.ViewHolder> {
    private ArrayList<Pahlawan> listPahlawan;

    public AdapterPahlawan(ArrayList<Pahlawan>list){
        this.listPahlawan = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pahlawan pahlawan = listPahlawan.get(position);

        Glide.with(holder.itemView.getContext())
                .load(pahlawan.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);



        holder.tvNama.setText(pahlawan.getName());
        holder.tvDescription.setText(pahlawan.getDiscription());


    }

    @Override
    public int getItemCount() {
        return listPahlawan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvNama, tvDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.img_foto);
            tvNama = itemView.findViewById(R.id.tv_judul);
            tvDescription = itemView.findViewById(R.id.tv_description);
        }

    }
}
