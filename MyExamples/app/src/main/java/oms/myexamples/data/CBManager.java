package oms.myexamples.data;
/**
 * Created by 430004587 on 24/09/2015.
 */
import com.couchbase.lite.Manager;
public class CBManager {

  private static Manager cbManager = new Manager();

  private static Manager obtenerInstancia(){
    return cbManager;
  }



}
