package oms.myexamples.views.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import oms.myexamples.R;
import oms.myexamples.entities.ContenidoItem;


/**
 * Created by Oscar on 17/09/15.
 */
public class ContenidoAdapter extends RecyclerView.Adapter<ContenidoAdapter.ContenidoViewHolder>{
  public ArrayList<ContenidoItem> lista;

  //Constructor
  public ContenidoAdapter(ArrayList<ContenidoItem> lista){
    this.lista=lista;
  }

  @Override
  public ContenidoViewHolder onCreateViewHolder(ViewGroup viewGroup,int viewType){
    View itemView = LayoutInflater.from(viewGroup.getContext())
      .inflate(R.layout.activity_contenido_row,viewGroup,false);

    ContenidoViewHolder viewHolder=new ContenidoViewHolder(itemView);

    return viewHolder;
  }

  @Override
  public void onBindViewHolder(ContenidoViewHolder viewHolder,int pos){
    ContenidoItem item=lista.get(pos);

    viewHolder.setContenidoRow(item);

  }

  @Override
  public int getItemCount(){
    return lista.size();
  }


  //Clase para implementar el patron ViewHolder
  public static class ContenidoViewHolder
          extends RecyclerView.ViewHolder
          implements View.OnClickListener{
    //private ImageView imgIcono;
    private TextView txtTitulo;
    private TextView txtDescripcion;
    private Class activityIntent;
    private Context contextoItem;

    //Etiqueta Log
    public final static String TAG = ContenidoViewHolder.class.getSimpleName();

    //Constructor
    // Referencias a los controles de un elemento de la lista
    public ContenidoViewHolder(View itemView){
      super(itemView);
      itemView.setOnClickListener(this);
      //imgIcono=(ImageView) itemView.findViewById(R.id.contenido_row_img_icono);
      txtTitulo=(TextView) itemView.findViewById(R.id.contenido_row_txt_titulo);
      txtDescripcion=(TextView) itemView.findViewById(R.id.contenido_row_txt_descripcion);
      contextoItem=itemView.getContext();
    }

    public void setContenidoRow(ContenidoItem item){
      //imgIcono.setImageResource(item.getIcono());
      txtTitulo.setText(item.getTitulo());
      txtDescripcion.setText(item.getDescripcion());
      activityIntent=item.getActivityIntent();
    }

    /**
     * Evento para el click de cada elemento de la lista.
     * @param view
     */
    @Override
    public void onClick(View view) {
      Intent intent = new Intent(contextoItem,activityIntent);
      contextoItem.startActivity(intent);
      Log.i(TAG, "El elemento seleccionado es: " + getAdapterPosition());

    }
  }



}
