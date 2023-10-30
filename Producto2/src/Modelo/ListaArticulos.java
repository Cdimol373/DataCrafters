package Modelo;

public class ListaArticulos extends Lista<Articulos> {

    // Constructor
    public ListaArticulos() {
        super();
    }

    // Método para buscar un artículo por su código
    public Articulos buscarPorCodigo(String codigo) {
        for (Articulos articulo : lista) {
            if (articulo.getCodigo().equals(codigo)) {
                return articulo;
            }
        }
        return null;
    }

}
