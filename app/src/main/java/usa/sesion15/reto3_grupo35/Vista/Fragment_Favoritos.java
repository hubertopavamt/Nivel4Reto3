package usa.sesion15.reto3_grupo35.Vista;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import usa.sesion15.reto3_grupo35.Modelo.BaseDatos.MotorBaseDatosSQLite;
import usa.sesion15.reto3_grupo35.R;


public class Fragment_Favoritos extends Fragment {

   View v;

    // CONEXION A LA BASE DE DATOS: SQLite
    MotorBaseDatosSQLite conector = new MotorBaseDatosSQLite(getContext(),"TiendaProductos", null, 1);

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__favoritos, container, false);
        //-----------------------------------------------------------------------------

        //-----------------------------------------------------------------------------
        return v;
    }

}