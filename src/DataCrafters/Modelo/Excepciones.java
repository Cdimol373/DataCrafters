package DataCrafters.Modelo;

public class Excepciones extends Exception{

    public static final String EXCEPCION_REMOVECLIENTE = "Error al eliminar el cliente";

    public Excepciones() {
        super();
    }
    public Excepciones(String msg) {
        super(msg);
    }

}
