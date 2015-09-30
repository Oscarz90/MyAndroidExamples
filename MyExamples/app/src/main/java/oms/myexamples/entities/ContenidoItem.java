package oms.myexamples.entities;

/**
 * Created by Oscar on 17/09/15.
 *
 */
public class ContenidoItem {
  private String Titulo;
  private String Descripcion;
  private int Icono;
  private Class Activity;

  public ContenidoItem(String Titulo, String Descripcion, int icono, Class Activity){
    this.Titulo=Titulo;
    this.Descripcion=Descripcion;
    this.Icono=icono;
    this.Activity=Activity;
  }

  /**
   * Titulo del Item
   */
  public String getTitulo() {
    return Titulo;
  }

  public void setTitulo(String titulo) {
    Titulo = titulo;
  }

  /**
   * Subtitulo del Item
   */
  public String getDescripcion() {
    return Descripcion;
  }

  public void setDescripcion(String descripcion) {
    Descripcion = descripcion;
  }

  /**
   * Icono del Item
   */
  public int getIcono() {
    return Icono;
  }

  public void setIcono(int icono) {
    this.Icono = icono;
  }

  /**
   * Activity a la cual hace el Intent en el evento OnClick
   */
  public Class getActivityIntent() {
    return Activity;
  }

  public void setActivityIntent(Class mActivity) {
    this.Activity = mActivity;
  }
}
