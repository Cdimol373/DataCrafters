package Modelo;

import java.time.LocalDateTime;

public class Pedidos {
    private int numeroPedido;
    private Cliente cliente;
    private Articulos articulo;
    private int cantidad;
    private LocalDateTime fechaHora;
    private boolean enviado;

    // Constructor
    public Pedidos(int numeroPedido, Cliente cliente, Articulos articulo, int cantidad, LocalDateTime fechaHora, boolean enviado) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.fechaHora = fechaHora;
        this.enviado = false;
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

    public double precioEnvio() {
        double gastosEnvio = articulo.getGastosEnvio();
        float descuentoCliente = cliente.descuentoEnv();

        return gastosEnvio * (1 - descuentoCliente);
    }

    // Método para marcar el pedido como enviado
    public boolean pedidoEnviado() {
        this.enviado = true;
        return this.enviado;
    }

    // Método para obtener el estado de envío del pedido
    public boolean comprobarEnviado() {
        return this.enviado;
    }

    @Override
    public String toString() {
        double precioTotal = calcularPrecio();
        double costeEnvio = articulo.getGastosEnvio();
        return "Pedidos{" +
                "numeroPedido=" + numeroPedido +
                ", fechaHora=" + fechaHora +
                ", Nif del cliente=" + cliente.getNif() +
                ", nombre del cliente=" + cliente.getNombre() +
                ", codigo del articulo=" + articulo.getCodigo() +
                ", descripcion del articulo=" + articulo.getDescripcion() +
                ", cantidad=" + cantidad +
                ", precio del articulo=" + articulo.getPrecio() +
                ", coste de envio=" + costeEnvio +
                ", precio total=" + precioTotal +
                ", enviado=" + (enviado ? "Si" : "No") +
                '}';
    }

}
