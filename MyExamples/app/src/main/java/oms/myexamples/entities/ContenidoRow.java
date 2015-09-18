package oms.myexamples.entities;

/**
 * Created by Oscar on 17/09/15.
 *
 */
public class ContenidoRow {
  private String Titulo;
  private String Descripcion;
  private int icono;

  public ContenidoRow(String Titulo, String Descripcion, int icono){
    this.Titulo=Titulo;
    this.Descripcion=Descripcion;
    this.icono=icono;
  }

  public String getTitulo() {
    return Titulo;
  }

  public void setTitulo(String titulo) {
    Titulo = titulo;
  }

  public String getDescripcion() {
    return Descripcion;
  }

  public void setDescripcion(String descripcion) {
    Descripcion = descripcion;
  }

  public int getIcono() {
    return icono;
  }

  public void setIcono(int icono) {
    this.icono = icono;
  }
}
