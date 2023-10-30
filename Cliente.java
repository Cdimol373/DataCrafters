package Modelo;


/**
 * Clase abstracta que representa un cliente de nuestra tienda.
 * Contiene todos los atributos y métodos comunes a todos los clientes
 */
public abstract class Cliente {

    private String nombre;
    private String domicilio;
    private String nif;
    private String email;
//Constructor

    /**
     *
     * @param nombre del cliente
     * @param domicilio del cliente
     * @param nif del cliente
     * @param email del cliente
     */
    public  Cliente(String nombre, String domicilio, String nif, String email) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.nif = nif;
        this.email = email;



    }

    // Getters y Setters

    /**
     * Devuelve el nombre del cliente
     * @return nombre del cliente
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente
     * @param nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el domicilio del cliente
     * @return el domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Establece el domicilio del cliente
     * @param domicilio
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Devuelve el nif del cliente
     * @return nif del cliente
     */
    public String getNif() {
        return nif;
    }

    /**
     * Establece el nif del cliente
     * @param nif
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Devuelve el email del cliente
     * @return email del cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el email del cliente
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * Devuelve una representación en forma de cadena de texto del objeto Cliente.
     * @return una cadena de texto que representa al objeto Cliente.
     */

    @Override
    public String toString() {
        return "\nNombre: " + nombre
                + "\nDomicilio: " + domicilio
                +"\nNumero nif: " + nif
                + "\nCorreo electrónico: " + email;
    }

    /**
     * Me devuelve el tipo de cliente
     * @return tipo cliente
     */
    public abstract String tipoCliente();

    /**
     * Calcula la cuota anual de cada cliente con dependencia del tipo de cliente
     * @return cuota anual del cliente
     */
   public abstract float calcAnual();

    /**
     * Me devuelve el descuento de los gastos de envio
     * @return descuento de gastos de envio
     */
   public abstract float  descuentoEnv();
}
