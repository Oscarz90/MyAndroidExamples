package oms.myexamples;

import android.app.Application;
import android.content.res.Configuration;
import android.util.Log;

import com.couchbase.lite.Manager;

import oms.myexamples.data.DataManager;

/**
 * Created by 430004587 on 24/09/2015.
 */
public class AppGlobal extends Application {
  private static Manager manager;
  private static String TAG = AppGlobal.class.getSimpleName();

  @Override
  public void onCreate() {
    super.onCreate();
    DataManager.inicializarDataManager(getApplicationContext(),Manager.DEFAULT_OPTIONS);
    manager= DataManager.obtenerInstancia();
    Log.v(TAG,"Manager Creado!");
  }

  @Override
  public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
  }

  @Override
  public void onLowMemory() {
    super.onLowMemory();
  }

  @Override
  public void onTrimMemory(int level) {
    super.onTrimMemory(level);
  }

  @Override
  public void onTerminate() {
    super.onTerminate();
    Log.i(TAG, "Destruccion de la Applicacion");
  }
}
