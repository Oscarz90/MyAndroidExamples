package oms.myexamples;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;

import com.couchbase.lite.Manager;
import com.couchbase.lite.android.AndroidContext;

import java.io.IOException;

import oms.myexamples.data.ManagerDB;

/**
 * Created by 430004587 on 24/09/2015.
 */
public class AppGlobal extends Application {
  private static String TAG = AppGlobal.class.getSimpleName();

  private static AppGlobal singleton;

  public AppGlobal getInstance(){
    return singleton;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    singleton=this;
    Log.i(TAG,"Creacion de la Applicacion");
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
