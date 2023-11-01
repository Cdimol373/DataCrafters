package DataCrafters.Modelo;

public class Articulo {

    private String codigo;
    private String descripcion;
    private double precioVenta;
    private double tiempoPreparacion;
    private double gastosEnvio;

    public Articulo(String codigo, String descripcion, double precioVenta, double tiempoPreparacion, double gastosEnvio) {

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.tiempoPreparacion = tiempoPreparacion;
        this.gastosEnvio = gastosEnvio;
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

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    @Override
    public String toString() {
       return "\nCodigo del artículo: " + codigo
       + "\n Descripción del artículo: " + descripcion
       + "\n Precio: " + precioVenta
       +"\n Tiempo de preparación: " + tiempoPreparacion
               +"\nGastos de envio: ";
   }


}
