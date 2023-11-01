package DataCrafters.Modelo;

public  class ClienteStandar extends Cliente {



    public ClienteStandar(String nombre, String domicilio, String nif, String email ) {
        super(nombre, domicilio, nif, email);

    }


    @Override
    public String toString(){
        return "\nCliente Standar: " + super.toString();
    }

    @Override
    public String tipoCliente() {
        return "\nCliente Estandar: ";
    }

    @Override
    public float calcAnual() {
        return 0;
    }

    @Override
    public float descuentoEnv() {
        return 0;
    }
}