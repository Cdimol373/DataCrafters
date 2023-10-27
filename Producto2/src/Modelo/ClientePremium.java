package Modelo;

public class ClientePremium extends Cliente {
    private double cuotaAnual;
    private double dtoGastosEnvio;  // Este podría ser un valor como 0.1 para un 10% de descuento

    public ClientePremium(String nombre, String domicilio, String nif, String email) {
        super(nombre, domicilio, nif, email);
    }

    // Getters y setters

    public double getCuotaAnual() {
        return cuotaAnual;
    }

    public void setCuotaAnual(double cuotaAnual) {
        this.cuotaAnual = cuotaAnual;
    }

    public double getDtoGastosEnvio() {
        return dtoGastosEnvio;
    }

    public void setDtoGastosEnvio(double dtoGastosEnvio) {
        this.dtoGastosEnvio = dtoGastosEnvio;
    }

    @Override
    public double calcularDtoGastosEnvio(double gastosEnvioOriginales) {
        // Aplicar el descuento
        return gastosEnvioOriginales * (1 - dtoGastosEnvio);
    }
}
