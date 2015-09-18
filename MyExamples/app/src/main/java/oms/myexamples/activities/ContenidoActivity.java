package oms.myexamples.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import java.util.ArrayList;

import oms.myexamples.R;
import oms.myexamples.entities.ContenidoRow;
import oms.myexamples.views.adapters.ContenidoAdapter;

public class ContenidoActivity extends AppCompatActivity {
  private Toolbar toolbarContenido;
  private RecyclerView rview;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_contenido);
    //Obtener referencia de los elementos
    toolbarContenido=(Toolbar)findViewById(R.id.toolbar_contenido);
    rview=(RecyclerView)findViewById(R.id.contenido_layouts);
    rview.setHasFixedSize(true);

    ArrayList<ContenidoRow> lista =new ArrayList<ContenidoRow>();

    lista.add(new ContenidoRow("Prueba","subPrueba",1));
    lista.add(new ContenidoRow("Prueba1","subPrueba1",1));

    final ContenidoAdapter adaptador=new ContenidoAdapter(lista);

    //LinearLayout lyt=(LinearLayout)findViewById(R.id.lyt);
    if(toolbarContenido!=null){
      setSupportActionBar(toolbarContenido);
      getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

    rview.setAdapter(adaptador);
    rview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_contenido, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}
