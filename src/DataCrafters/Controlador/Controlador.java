package DataCrafters.Controlador;
import DataCrafters.Modelo.*;

import java.time.LocalDateTime;

public class Controlador {
    private Datos datos;

    public Controlador() {
        datos = new Datos ();
    }

    public  void crearArticulo(String codigo, String descripcion, double precio, int tiempoPreparacion, double gastosEnvio){
        Articulo articulo = new Articulo(codigo, descripcion, precio, tiempoPreparacion, gastosEnvio);
        datos.getListaArticulos().agregarArticulos(articulo);
    }
    public void mostrarArticulos() {
        datos.getListaArticulos().mostrarArticulos();
    }

    public Articulo buscarPorCodigo(String codigo) {
        return datos.getListaArticulos().buscarPorCodigo(codigo);
    }

    public void  crearCliente(Cliente cliente){
        datos.getListaClientes().agregarCliente(cliente);
    }

    public void mostrarClientes() {
        datos.getListaClientes().mostrarCliente();
    }

    public Cliente buscarCliente(String nif) {
        return datos.getListaClientes().buscarCliente(nif);


        }


    public void crearPedido(int numeroPedido, Cliente cliente, Articulo articulo, int cantidad, LocalDateTime fechaHora, boolean enviado){
        Pedido pedido = new Pedido(numeroPedido,cliente, articulo, cantidad, fechaHora, enviado);
        datos.getListaPedidos().addElement(pedido);
    }


    public void mostrarPedidos(){
        datos.getListaPedidos().mostrar();
    }

    public Pedido mostrarNumeroPedido(int numeroPedido){
        return datos.getListaPedidos().buscarPedidos(numeroPedido);
    }
}
