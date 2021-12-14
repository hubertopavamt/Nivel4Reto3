package usa.sesion15.reto3_grupo35.Vista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import usa.sesion15.reto3_grupo35.Modelo.Adaptador;
import usa.sesion15.reto3_grupo35.Modelo.BaseDatos.MotorBaseDatosSQLite;
import usa.sesion15.reto3_grupo35.Modelo.Entidad;
import usa.sesion15.reto3_grupo35.R;


public class Fragment_Productos extends Fragment {

    View v;

    ListView listaProductos;
    Adaptador adaptador;

    // CONEXION A LA BASE DE DATOS: SQLite
    MotorBaseDatosSQLite conector = new MotorBaseDatosSQLite(getContext(),"TiendaProductos", null, 1);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__productos, container, false);
        //-----------------------------------------------------------------------------
        listaProductos = (ListView) v.findViewById(R.id.lista_productos);
        adaptador = new Adaptador(GetListItems(), getContext());

        listaProductos.setAdapter(adaptador);


        //-----------------------------------------------------------------------------
        return v;
    }
    private ArrayList<Entidad> GetListItems(){
        ArrayList<Entidad> listaItems = new ArrayList<>();
        listaItems.add(new Entidad(R.drawable.p1, "Chaqueta Masculina", "Linea Masculina 2022"));
        listaItems.add(new Entidad(R.drawable.p2, "Chaqueta Femenina", "Linea Femenina 2022"));
        listaItems.add(new Entidad(R.drawable.p3, "Chaqueta Deportiva", "Linea Deportiva 2022"));
        return listaItems;
    }


}