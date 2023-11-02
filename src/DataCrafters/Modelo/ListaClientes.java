package DataCrafters.Modelo;

public class ListaClientes extends Lista<Cliente>{
    public ListaClientes() {
        super();
    }

    public Cliente buscarCliente(String nif){
        for (Cliente cliente: lista) {
            if (cliente.getNif().equalsIgnoreCase(nif))
                return cliente;
        }
        return null;
}



    public void eliminarCliente(Cliente cliente) throws Excepciones {
        if(super.removeElement(cliente) == false){
            throw new Excepciones(Excepciones.EXCEPCION_REMOVECLIENTE);
        }

    }



    // Método para añadir clientes
    public void agregarCliente (Cliente cliente){
        this.agregarCliente(cliente);
    }
    public void mostrarCliente(){
        this.mostrar();
    }
}
