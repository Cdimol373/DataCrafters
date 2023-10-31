package DataCrafters.Modelo;

public class ListaPedidos extends Lista<Pedido> {
    public ListaPedidos() {
        super();
    }

    public boolean buscarPedidos(int numeroPedido){
        for (Pedido pedido: lista) {
            if (pedido.getNumeroPedido() == numeroPedido)
                return true;
        }
        return false;
    }

}
