package DataCrafters.Modelo;

public class ListaArticulos extends Lista<Articulo>{
    public ListaArticulos() {
        super();
    }

    public Articulo buscarArticulo(String codigo) {

            for (Articulo articulo : lista) {
                if (articulo.getCodigo().equals(codigo)) {
                    return articulo;

                }
                }
            return null;
            }
    public void mostrarArticulos() {
        this.mostrar();
    }
    }