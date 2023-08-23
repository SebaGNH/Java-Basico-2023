
package productos2023vates;

import java.util.ArrayList;

public class Comercio {
    ArrayList<Persona> personas;
    ArrayList<Producto> productos;
    
    public void agregarPersona(Persona p){
        personas.add(p);
    }
    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public String listarProductos(){
        String listaProducto = "";
        for (Producto p : productos) {
            listaProducto = "";
        }
        return listaProducto;
    }
    
    public String obtenerProductoMasCaro(){
        float mayorPrecio = 0f;
        Producto p = new Producto();
        for (Producto producto : productos) {
            if (producto != null && producto.getPrecio() > mayorPrecio) {
                mayorPrecio = producto.getPrecio();
                p = producto;
            }
        }
        return p.toString();
    }
    
        public String obtenerProductoMasBarato(){
        float menorPrecio = 0f;
        Producto p = new Producto();
        for (Producto producto : productos) {
            if (producto != null && producto.getPrecio() < menorPrecio) {
                menorPrecio = producto.getPrecio();
                p = producto;
            }
        }
        return p.toString();
    }
}

