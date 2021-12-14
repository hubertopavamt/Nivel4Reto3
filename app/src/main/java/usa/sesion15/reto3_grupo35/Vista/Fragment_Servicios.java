package usa.sesion15.reto3_grupo35.Vista;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import usa.sesion15.reto3_grupo35.Modelo.Adaptador;
import usa.sesion15.reto3_grupo35.Modelo.BaseDatos.MotorBaseDatosSQLite;
import usa.sesion15.reto3_grupo35.Modelo.Entidad;
import usa.sesion15.reto3_grupo35.R;


public class Fragment_Servicios extends Fragment {

    View v;

    ListView listaServicios;
    Adaptador adaptador;

    // CONEXION A LA BASE DE DATOS: SQLite
    MotorBaseDatosSQLite conector = new MotorBaseDatosSQLite(getContext(),"TiendaProductos", null, 1);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__servicios, container, false);
        //-----------------------------------------------------------------------------
        listaServicios = (ListView) v.findViewById(R.id.lista_servicios);
        adaptador = new Adaptador(GetArrayItems(), getContext());

        listaServicios.setAdapter(adaptador);

        //-----------------------------------------------------------------------------
        return v;
    }
    private ArrayList<Entidad> GetArrayItems(){
        ArrayList<Entidad> listaItems = new ArrayList<Entidad>();
        listaItems.add(new Entidad(R.drawable.s1, "Ventas", "Venta en nuestras sucursales"));
        listaItems.add(new Entidad(R.drawable.s2, "Diseño", "Diseños Personalizados"));
        listaItems.add(new Entidad(R.drawable.s3, "Mantenimiento", "Arreglo de sus productos"));

        return listaItems;
    }
}