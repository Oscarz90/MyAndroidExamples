package oms.myexamples.views.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import oms.myexamples.R;
import oms.myexamples.entities.ContenidoRow;


/**
 * Created by Oscar on 17/09/15.
 */
public class ContenidoAdapter extends RecyclerView.Adapter<ContenidoAdapter.ContenidoViewHolder>{
  public ArrayList<ContenidoRow> lista;

  //Constructor
  public ContenidoAdapter(ArrayList<ContenidoRow> lista){
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
    ContenidoRow item=lista.get(pos);

    viewHolder.bindContenidoRow(item);

  }

  @Override
  public int getItemCount(){
    return lista.size();
  }


  //Clase para implementar el patron ViewHolder
  public static class ContenidoViewHolder extends RecyclerView.ViewHolder{
    //private ImageView imgIcono;
    private TextView txtTitulo;
    private TextView txtDescripcion;

    //Constructor
    // Referencias a los controles de un elemento de la lista
    public ContenidoViewHolder(View itemView){
      super(itemView);
      //imgIcono=(ImageView) itemView.findViewById(R.id.contenido_row_img_icono);
      txtTitulo=(TextView) itemView.findViewById(R.id.contenido_row_txt_titulo);
      txtDescripcion=(TextView) itemView.findViewById(R.id.contenido_row_txt_descripcion);
    }

    public void bindContenidoRow(ContenidoRow item){
      //imgIcono.setImageResource(item.getIcono());
      txtTitulo.setText(item.getTitulo());
      txtDescripcion.setText(item.getDescripcion());

    }
  }



}
