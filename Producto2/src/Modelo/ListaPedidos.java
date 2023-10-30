package Modelo;

public class ListaPedidos extends Lista<Pedidos> {

    // Constructor
    public ListaPedidos() {
        super();
    }

    // Método para buscar un pedido por su número de pedido
    public Pedidos buscarPorNumeroPedido(int numeroPedido) {
        for (Pedidos pedido : lista) {
            if (pedido.getNumeroPedido() == numeroPedido) {
                return pedido;
            }
        }
        return null;  // Si no se encuentra el pedido
    }

    // Método para mostrar todos los pedidos de un cliente específico
    public void mostrarPedidosCliente(String nifCliente) {
        for (Pedidos pedido : lista) {
            if (pedido.getCliente().getNif().equals(nifCliente)) {
                System.out.println(pedido);
            }
        }
    }

}
