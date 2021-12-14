package usa.sesion15.reto3_grupo35.Modelo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import usa.sesion15.reto3_grupo35.R;


public class Adaptador extends BaseAdapter {

    ArrayList<Entidad> lista_items;
    Context context;



    public Adaptador(ArrayList<Entidad> lista_items, Context context) {
        this.lista_items = lista_items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return lista_items.size(); // Devuelve cuntos elelmentos hay en la lista
    }

    @Override
    public Object getItem(int posicion) {
        return lista_items.get(posicion); // devuelve la posicion del item
    }

    @Override
    public long getItemId(int posicion) {
        return 0; // No lo vamos a trabajar
    }

    /*
    Este es el metodo mas importante, aqui vamos a asignar el item y lo elementos y valores a
    cada item.
     */
    @Override
    public View getView(int posicion, View v, ViewGroup viewGroup) {

        Entidad datosItem = (Entidad) getItem(posicion);

        v = LayoutInflater.from(context).inflate(R.layout.item, null);
        //-------------------------------------------------------------------

        ImageView imagen = (ImageView)v.findViewById(R.id.imagen1_item);
        TextView titulo = (TextView)v.findViewById(R.id.titulo_item);
        TextView descripcion = (TextView)v.findViewById(R.id.descripcion_item);

        TextView descripcion2 = (TextView)v.findViewById(R.id.descripcion2_item);
        Button boton1 = (Button) v.findViewById(R.id.boton1_item);
        CheckBox favoritos = (CheckBox) v.findViewById(R.id.favoritos_item);
        CheckBox clasificacion = (CheckBox) v.findViewById(R.id.clasificacion_item);

        /*
        Pongo los datos de cada item desde la clase Entidad dentro de cada elemento xml
         */
        imagen.setImageResource(datosItem.getImagen());
        titulo.setText(datosItem.getTitulo());
        descripcion.setText(datosItem.getDescripcion());

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "item:" + titulo.getText(), Toast.LENGTH_LONG ).show();
            }
        });

        //-------------------------------------------------------------------
        return v;
    }

}
