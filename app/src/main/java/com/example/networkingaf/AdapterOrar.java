package com.example.networkingaf;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterOrar extends RecyclerView.Adapter<AdapterOrar.OrarHolder> {
    private ArrayList<CardviewOrar> orarList;

    public static class OrarHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView titluActivitate, oreActivitate, despreActivitate, locatieActivitate, sfat;
        public OrarHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imagineVreme);
            titluActivitate = itemView.findViewById(R.id.titluActivitate);
            oreActivitate = itemView.findViewById(R.id.oreActivitate);
            despreActivitate = itemView.findViewById(R.id.despreActivitate);
            locatieActivitate = itemView.findViewById(R.id.locatieActivitate);
            sfat = itemView.findViewById(R.id.sfat);
        }
    }

    public AdapterOrar(ArrayList<CardviewOrar> orarList) {
        this.orarList = orarList;
    }

    @NonNull
    @Override
    public OrarHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.orar, parent, false);
        OrarHolder orarHolder = new OrarHolder(v);
        return orarHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrarHolder holder, int position) {
        CardviewOrar o = orarList.get(position);
        try {
            holder.imageView.setImageResource(o.getmImageResource());
            holder.sfat.setText(o.getSfat());
            holder.titluActivitate.setText(o.getTitluActivitate());
            holder.locatieActivitate.setText(o.getLocatieActivitate());
            holder.despreActivitate.setText(o.getDespreActivitate());
            holder.oreActivitate.setText(o.getOreActivitate());
        } catch (Exception e) {
            Log.d("Exceptie imagine", e.getMessage());
        }
    }

    @Override
    public int getItemCount() {
        return orarList.size();
    }
}
