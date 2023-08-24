
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
    
    // Modificar un producto       
    public void modificarProducto(String id, Producto pEdit) {
        for (Producto pr : productos) {
            if (pr.getIdProducto().equals(id)) {
                pr.setNombreProducto(pEdit.getNombreProducto());
                pr.setPrecio(pEdit.getPrecio());
                pr.setTipoCategoria(pEdit.getTipoCategoria());
                break;
            }
        }
    }
    
    public void eliminarProducto(String id) {
        for (int i = 0; i < productos.size(); i++) {
            Producto pr = productos.get(i);
            if (pr.getIdProducto().equals(id)) {
                productos.remove(i);
                break;
            }
        }
    }
    

    public String listarProductos(){
        String listaProducto = "";
        for (Producto p : productos) {
            listaProducto = p.toString();
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

