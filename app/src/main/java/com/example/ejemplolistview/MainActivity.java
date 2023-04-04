package com.example.ejemplolistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Inmueble> ListaInmuebles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CargarDatos();
        CargarListView();
    }

    public void CargarListView () {
        ArrayAdapter <Inmueble> adaptador = new AdaptadorLista(this, R.layout.item, ListaInmuebles, getLayoutInflater());
        ListView vistaLista = findViewById(R.id.ListaPrincipal);
        vistaLista.setAdapter (adaptador);
    }

    public void CargarDatos () {
        ListaInmuebles.add (new Inmueble(R.drawable.casita200sqft, "Km 797 Ruta Nacional 9, Córdoba", 95000));
        ListaInmuebles.add (new Inmueble(R.drawable.casita500sqft, "Km 1809 Ruta Nacional 3, Chubut", 265000));
        ListaInmuebles.add (new Inmueble(R.drawable.casa1000sqft, "19313 Dardo Rocha, Villa Viñedo, MZ", 425000));
        ListaInmuebles.add (new Inmueble(R.drawable.casa2000sqft, "829 Calle 166 Oeste, Villa Viñedo, MZ", 1100000));
        ListaInmuebles.add (new Inmueble(R.drawable.casa4000sqft, "2425 Calle 191, Villa Viñedo, MZ", 2400000));
        ListaInmuebles.add (new Inmueble(R.drawable.casona8000sqft, "Km 199 Ruta Nacional 259, Mendoza", 4500000));
        ListaInmuebles.add (new Inmueble(R.drawable.mansion16000sqft, "4055 J.M. Loreto, Benavídez, BA", 10000000));
    }
}