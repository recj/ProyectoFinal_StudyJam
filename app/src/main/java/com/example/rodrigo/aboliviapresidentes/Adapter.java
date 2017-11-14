package com.example.rodrigo.aboliviapresidentes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rodrigo on 12/11/2017.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.AplicacionViewholder> {
    List<presidente> dataset;
    Context context;
    onAplicacionSelectedListener onAplicacionSelectedListener;


    public interface onAplicacionSelectedListener{
        void onAplicacionSelected(presidente aplicacion);
    }
    public Adapter(Context context, onAplicacionSelectedListener onAplicacionSelectedListener) {
        this.context = context;
        this.dataset = new ArrayList<>();
        this.onAplicacionSelectedListener = onAplicacionSelectedListener;
    }

    @Override
    public AplicacionViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_apps,parent,false);
        return new AplicacionViewholder(view);
    }
    @Override
    public void onBindViewHolder(AplicacionViewholder holder, int position) {
        presidente aplicacion = dataset.get(position);
        holder.nombre.setText(aplicacion.getNombre());
        holder.imagen.setImageResource(aplicacion.getImagen());

        holder.setOnAplicacionSelectedListener(aplicacion, onAplicacionSelectedListener);
    }
    @Override
    public int getItemCount() {
        return dataset.size();
    }
    public class AplicacionViewholder extends RecyclerView.ViewHolder {

        View cardView;
        ImageView imagen;
        TextView nombre;

        public AplicacionViewholder(View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.card_main);
            imagen = itemView.findViewById(R.id.imagen_item);
            nombre = itemView.findViewById(R.id.texto_item);
        }

        public void setOnAplicacionSelectedListener(final presidente aplicacion, final onAplicacionSelectedListener onAplicacionSelectedListener) {
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onAplicacionSelectedListener.onAplicacionSelected(aplicacion);
                }
            });
        }
    }

    public void setDataset(List<presidente> aplicacion) {
        if (aplicacion == null){
            dataset = new ArrayList<>();
        }
        else{
            dataset = aplicacion;
        }
        notifyDataSetChanged();
    }

}

