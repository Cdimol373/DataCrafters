package Modelo;

import java.util.ArrayList;

public class Lista<T> {
    protected ArrayList<T> lista;

    public Lista() {
        lista = new ArrayList<>();
    }

    public void agregar(T elemento) {
        lista.add(elemento);
    }

    public void eliminar(T elemento) {
        lista.remove(elemento);
    }

    public void mostrar() {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    public ArrayList<T> obtenerLista() {
        return lista;
    }
}


