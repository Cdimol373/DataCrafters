package Modelo;

public class Pedido {

    private int numeroPedido;
    private Cliente cliente;
    private Articulo articulo;

    public Pedido(int numeroPedido, Cliente cliente, Articulo articulo) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.articulo = articulo;
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
    @Override
    public String toString(){
        return "\nNúmero de pedido: " + numeroPedido
                + "\nCliente: " + cliente
                + "\nArticulo: " +articulo;
    }
}

