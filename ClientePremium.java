package Modelo;

/**
 * Clase que extiende de Cliente
 */
public abstract class ClientePremium extends Cliente{
    private double descuento;


    public ClientePremium(String nombre, String domicilio, String nif, String email, double descuento) {
        super(nombre, domicilio, nif, email);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString(){
        return "\nCliente Premium: " + super.toString()
                + "\n Descuento: " + descuento;
    }
}
