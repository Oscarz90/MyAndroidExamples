package oms.myexamples.data;
/**
 * Created by 430004587 on 24/09/2015.
 */
import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.couchbase.lite.Manager;
import com.couchbase.lite.ManagerOptions;
import com.couchbase.lite.android.AndroidContext;


import java.io.IOException;

import oms.myexamples.AppGlobal;

public class DataManager {

  private final static String TAG = DataManager.class.getSimpleName();
  private static Manager dbManager;
  private static Context contexto;
  private static ManagerOptions managerOpciones;


  public static void inicializarDataManager(Context context,ManagerOptions mgOpciones){
    contexto=context;
    managerOpciones=mgOpciones;
  }

  public static Manager obtenerInstancia(){
    if(dbManager!=null){
      try {
        dbManager=new Manager(new AndroidContext(contexto), managerOpciones);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    return dbManager;
  }



}
