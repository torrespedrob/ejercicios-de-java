
package ejercicio3;


public class Elemento {
  private String producto;
  private double precio;
  private int cantidad;  

  public double getPrecio() {
    return precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public String getProducto() {
    return producto;
  }
  

  public Elemento(String producto, double precio, int cantidad) {
    this.producto = producto;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

}
