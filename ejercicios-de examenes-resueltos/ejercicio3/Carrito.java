
package ejercicio3;
import java.util.ArrayList;

public class Carrito {
  
  ArrayList<Elemento> a = new ArrayList<>();
  
  
  public void agrega(Elemento e) {
    boolean existe = false;
    
    for (Elemento elemento : a) {
      if ((elemento.getProducto()).equals(e.getProducto())) {
        elemento.setCantidad(elemento.getCantidad()+e.getCantidad());
        existe = true;
      }
      
      
    }
    if (!existe) {
      a.add(e);
    }
      
    
  }

  public int numeroDeElementos() {
    return a.size();
  }
  public double importeTotal() {
    double total = 0;
    for (Elemento elemento : a) {
      total = total + elemento.getPrecio() * elemento.getCantidad();
    }
    return total;
 
  }

  @Override
  public String toString() {
    String cadena = "Contenido del carrito\n" + "=====================\n";
    for (Elemento elemento : a) {
      cadena += (elemento.getProducto() + " PVP: " + elemento.getPrecio() + " Unidades: " + elemento.getCantidad() + " Subtotal: " + (elemento.getPrecio()*elemento.getCantidad()) + "\n");
    }
    
    return cadena;
  }
  
  
}

