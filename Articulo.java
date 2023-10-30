package Modelo;

public class Articulo {

    private String codigo;
    private String descripcion;
    private double precioVenta;
    private double tiempoPreparacion;

    public Articulo(String codigo, String descripcion, double precioVenta, double tiempoPreparacion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(double tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

   @Override
    public String toString() {
       return "\nCodigo del artículo: " + codigo
       + "\n Descripción del artículo: " + descripcion
       + "\n Precio: " + precioVenta
       +"\n Tiempo de preparación: " + tiempoPreparacion;
   }
}
