package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Articulos {
    private String codigo;
    private String descripcion;
    private double precio;
    private int tiempoPreparacion;
    private double gastosEnvio;

    // Lista estática para almacenar todos los artículos
    private static List<Articulos> listaArticulos = new ArrayList<>();

    // Constructor
    public Articulos(String codigo, String descripcion, double precio, int tiempoPreparacion, double gastosEnvio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.tiempoPreparacion = tiempoPreparacion;
        this.gastosEnvio = gastosEnvio;
    }

    // Getters y Setters


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    // Método para añadir artículos
    public static void anadirArticulos(Articulos articulo) {
        listaArticulos.add(articulo);
    }

    // Método para mostrar todos los artículos
    public static void mostrarArticulos() {
        for (Articulos articulo : listaArticulos) {
            System.out.println(articulo);
        }
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", tiempoPreparacion=" + tiempoPreparacion +
                ", gastosEnvio=" + gastosEnvio +
                '}';
    }
}
