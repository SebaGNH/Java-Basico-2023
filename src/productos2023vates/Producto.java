
package productos2023vates;

public class Producto {
    private String idProducto;
    private String nombreProducto;
    private float precio;
    private String tipoCategoria;

    public Producto(String idProducto, String nombreProducto, float precio, String tipoCategoria) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.tipoCategoria = tipoCategoria;
    }
    
        public Producto() {
        this.idProducto = "";
        this.nombreProducto = "";
        this.precio = 0f;
        this.tipoCategoria = "";
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", tipoCategoria=" + tipoCategoria + '}';
    }

    
        
}
