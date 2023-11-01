package DataCrafters.Modelo;

import java.util.ArrayList;

public class Lista<T> {
    ArrayList<T> lista;

    public Lista () {
        lista = new ArrayList<T>();
    }
    public int numElementos() {
        return lista.size();
    }
    public void addElement(T elemento){
        lista.add(elemento);

    }
    public boolean removeElement(T elemento){

       return lista.remove(elemento);

    }
    public T posicion(int position) {
        if (position >= 0 && position < lista.size()) {
            return lista.get(position);
        } else {
            return null;
        }
    }
    public void limpiar() {
        lista.clear();
    }

    public boolean estaVacia() {
        return lista.isEmpty();
    }
    public void mostrar() {
        for (T t : lista) {
            System.out.println(t);
        }
    }

    public ArrayList<T> obtenerLista() {
        return lista;
    }

}
