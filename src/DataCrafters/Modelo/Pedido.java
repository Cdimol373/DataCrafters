package DataCrafters.Modelo;
import java.time.LocalDateTime;
public class Pedido {

    private int numeroPedido;
    private Cliente cliente;
    private Articulo articulo;
    private int cantidad;
    private LocalDateTime fechaHora;
    private boolean enviado;

    public Pedido(int numeroPedido, Cliente cliente, Articulo articulo, int cantidad, LocalDateTime fechaHora, boolean enviado) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.fechaHora = fechaHora;
        this.enviado = enviado;
    }

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

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
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

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    @Override
    public String toString(){
        double precioTotal = calcularPrecio();
        double costeEnvio = articulo.getGastosEnvio();
        return "\nNúmero de pedido: " + numeroPedido
                +  "Fecha y hora: " +fechaHora
                + "Nombre" + cliente.getNombre()
                + "\nNIF del cliente: " + cliente.getNif()
                + "\nCodigo del articulo: " +articulo.getCodigo()
                + "\nDescripcion del articulo=" + articulo.getDescripcion()
                + "\nCantidad=" + cantidad
                + "\nPrecio del articulo=" + articulo.getPrecioVenta()
                + "\nGastos de envio=" + articulo.getGastosEnvio()
                + "\nImporte total=" + precioTotal
                + ", enviado=" + (enviado ? "Si" : "No");
    }
    public double calcularPrecio() {
        double precioArticulo = articulo.getPrecioVenta();
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
}

