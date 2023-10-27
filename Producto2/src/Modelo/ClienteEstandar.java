package Modelo;

public class ClienteEstandar extends Cliente {


    public ClienteEstandar(String nombre, String domicilio, String nif, String email) {
        super(nombre, domicilio, nif, email);
    }

    @Override
    public double calcularDtoGastosEnvio(double gastosEnvioOriginales) {
        // Sin descuento para clientes estándar
        return gastosEnvioOriginales;
    }

}
