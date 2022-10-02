
package beans;

import java.sql.Date;

public class Alquiler {
    private int id;
    private String username;
    private Date fecha;
    private boolean cantidadExtras;
    private String descripcion;

    public Alquiler(int id, String username, Date fecha, boolean cantidadExtras, String descripcion) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.cantidadExtras = cantidadExtras;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isCantidadExtras() {
        return cantidadExtras;
    }

    public void setCantidadExtras(boolean cantidadExtras) {
        this.cantidadExtras = cantidadExtras;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", cantidadExtras=" + cantidadExtras + ", descripcion=" + descripcion + '}';
    }
    
}
