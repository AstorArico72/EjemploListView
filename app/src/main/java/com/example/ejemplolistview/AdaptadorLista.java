package com.example.ejemplolistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdaptadorLista extends ArrayAdapter <Inmueble> {
    private Context contexto;
    private List <Inmueble> ListaInmuebles;
    private LayoutInflater inflador;

    public AdaptadorLista(@NonNull Context context, int resource, @NonNull List<Inmueble> objects, LayoutInflater li) {
        super(context, resource, objects);
        this.contexto = context;
        this.ListaInmuebles = objects;
        this.inflador = li;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View VistaItem = convertView;
        if (VistaItem == null) {
            VistaItem = inflador.inflate (R.layout.item, parent, false);
        }
        Inmueble nuevo = ListaInmuebles.get (position);

        ImageView foto = VistaItem.findViewById (R.id.Foto);
        TextView direccion = VistaItem.findViewById(R.id.TWDireccion);
        TextView precio = VistaItem.findViewById(R.id.TWPrecio);

        foto.setImageResource (nuevo.obtenerNumeroFoto());
        direccion.setText (nuevo.obtenerDireccion());
        precio.setText(nuevo.obtenerPrecio() + "");

        return VistaItem;
    }
}