package Modelo;

public abstract class ClienteStandar extends Cliente {

String codSocio;

    public ClienteStandar(String nombre, String domicilio, String nif, String email, String codSocio) {
        super(nombre, domicilio, nif, email);
        this.codSocio = codSocio;
    }

    public String getCodSocio() {
        return codSocio;
    }

    public void setCodSocio(String codSocio) {
        this.codSocio = codSocio;
    }
    @Override
    public String toString(){
        return "\nCliente Standar: " + super.toString()
                + "\n Código de socio: " + codSocio;
    }
}