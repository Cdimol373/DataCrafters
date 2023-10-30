package Modelo;

public class ClienteEstandar extends Cliente {


    public ClienteEstandar(String nombre, String domicilio, String nif, String email) {
        super(nombre, domicilio, nif, email);
    }

    @Override
    public String tipoCliente() {
        return "Estandar";
    }

    @Override
    public float calcAnual() {
        return 0;
    }

    @Override
    public float descuentoEnv() {
        return 0;
    }

    @Override
    public double calcularDtoGastosEnvio(double gastosEnvioOriginales) {
        // Sin descuento para clientes estándar
        return gastosEnvioOriginales;
    }

}
