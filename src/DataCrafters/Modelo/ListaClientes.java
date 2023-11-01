package DataCrafters.Modelo;

public class ListaClientes extends Lista<Cliente>{
    public ListaClientes() {
        super();
    }

    public boolean buscarCliente(String nif){
        for (Cliente cliente: lista) {
            if (cliente.getNif().equalsIgnoreCase(nif))
                return true;
        }
        return false;
}


    public void eliminarCliente(Cliente cliente) throws Excepciones {
        if(super.removeElement(cliente) == false){
            throw new Excepciones(Excepciones.EXCEPCION_REMOVECLIENTE);
        }

    }
}
