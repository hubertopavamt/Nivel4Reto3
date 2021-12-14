package usa.sesion15.reto3_grupo35.Vista;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import usa.sesion15.reto3_grupo35.Contolador.MainActivity;
import usa.sesion15.reto3_grupo35.R;


public class Fragment_Sucursales extends Fragment {


    View v;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment__sucursales, container, false);
        //-----------------------------------------------------------------------------


        //-----------------------------------------------------------------------------
        return v;
    }

}