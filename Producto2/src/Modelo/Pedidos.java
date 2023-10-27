package Modelo;

import java.time.LocalDateTime;

public class Pedidos {
    private int numeroPedido;
    private Cliente cliente;
    private Articulos articulo;  // Asegúrate de que el nombre de la clase sea 'Articulos' como en tu descripción
    private int cantidad;
    private LocalDateTime fechaHora;

    // Constructor
    public Pedidos(int numeroPedido, Cliente cliente, Articulos articulo, int cantidad, LocalDateTime fechaHora) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.fechaHora = fechaHora;
    }

    // Getters y Setters
    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Articulos getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulos articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    // Método para calcular el precio total del pedido
    public double calcularPrecio() {
        double precioArticulo = articulo.getPrecio();
        double gastosEnvio = articulo.getGastosEnvio();
        double descuentoEnvio = cliente.calcularDtoGastosEnvio(gastosEnvio);

        return (precioArticulo * cantidad) + descuentoEnvio;
    }

    @Override
    public String toString() {
        return "Pedidos{" +
                "numeroPedido=" + numeroPedido +
                ", cliente=" + cliente +
                ", articulo=" + articulo +
                ", cantidad=" + cantidad +
                ", fechaHora=" + fechaHora +
                '}';
    }
}
