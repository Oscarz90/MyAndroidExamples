package oms.myexamples.data;
/**
 * Created by 430004587 on 24/09/2015.
 */
import android.util.Log;

import com.couchbase.lite.Context;
import com.couchbase.lite.Manager;
import com.couchbase.lite.ManagerOptions;
import com.couchbase.lite.android.AndroidContext;

import java.io.IOException;

public class ManagerDB {
  /**
   * Variables para uso de Manager CouchBase
   */
  private static Manager managerDB;
  private static Context contextDB;
  private static ManagerOptions managerOptionsDB;
  /**
   * Variables LOG
   */
  private static final String TAG = ManagerDB.class.getSimpleName();

  public static Manager obtenerInstancia(){
    if(managerDB==null){
      try {
        managerDB=new Manager(contextDB, managerOptionsDB);
        Log.i(TAG,"Instancia de Manager obtenida correctamente");
      }catch (IOException e){
        Log.e(TAG, "No se pudo crear la instancia de Manager: ", e );
        return null;
      }
    }
    //Regresa instancia
    return managerDB;
  }


  public static void inicializarManager(Context contexto, ManagerOptions managerOptions){
    contextDB=contexto;
    managerOptionsDB=managerOptions;
  }

}
