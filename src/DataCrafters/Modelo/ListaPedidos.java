package DataCrafters.Modelo;

public class ListaPedidos extends Lista<Pedido> {
    public ListaPedidos() {
        super();
    }

    public Pedido buscarPedidos(int numeroPedido){
        for (Pedido pedido: lista) {
            if (pedido.getNumeroPedido() == numeroPedido)
                return pedido;
        }
        return null;
    }

}
