package DataCrafters.Modelo;

/**
 * Clase que extiende de Cliente
 */
public class ClientePremium extends Cliente{
    private final static float cuotaAnual = 30;
    private final static float  descuentoEnvio = 0.2F;




    public ClientePremium(String nombre, String domicilio, String nif, String email) {
        super(nombre, domicilio, nif, email);
    }





    @Override
    public String toString(){
        return "\nCliente Premium: " + super.toString()
                +"\nCuota Anual: " + cuotaAnual
                + "\nDescuento: " + descuentoEnvio;

    }

    @Override
    public String tipoCliente() {
        return "Cliente Premium: ";
    }

    @Override
    public float calcAnual() {
        return cuotaAnual;
    }

    @Override
    public float descuentoEnv() {
        return descuentoEnvio;
    }

    public double calcularDtoGastosEnvio(double gastosEnvioOriginales) {
        // Aplicar el descuento
        return gastosEnvioOriginales * (1 - descuentoEnvio);
}
    }
