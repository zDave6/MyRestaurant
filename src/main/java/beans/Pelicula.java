
package beans;

public class Pelicula {
    private int id;
    private String producto;
    private String descripcion;
    private String extras;
    private int cantidad;
    private boolean cantidadExtras;

    public Pelicula(int id, String producto, String descripcion, String extras, int cantidad, boolean cantidadExtras) {
        this.id = id;
        this.producto = producto;
        this.descripcion = descripcion;
        this.extras = extras;
        this.cantidad = cantidad;
        this.cantidadExtras = cantidadExtras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isCantidadExtras() {
        return cantidadExtras;
    }

    public void setCantidadExtras(boolean cantidadExtras) {
        this.cantidadExtras = cantidadExtras;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", producto=" + producto + ", descripcion=" + descripcion + ", extras=" + extras + ", cantidad=" + cantidad + ", cantidadExtras=" + cantidadExtras + '}';
    }
    
    
}
