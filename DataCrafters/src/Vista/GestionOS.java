package Vista;

import Controlador.Controlador;
import Modelo.Articulo;
import Modelo.ListaArticulos;
import Modelo.ListaClientes;
import Modelo.ListaPedidos;

import java.util.Scanner;
public class GestionOS {
    private Controlador controlador;
    Scanner teclado = new Scanner(System.in);

    ListaArticulos listaArticulos = new ListaArticulos();

    ListaClientes listaClientes = new ListaClientes();

    ListaPedidos listaPedidos = new ListaPedidos();
    public GestionOS() {
        controlador = new Controlador();
    }
    public void inicio() {
        boolean salir = false;
        char opcio;
        do {
            System.out.println("1. Gestión Articulo");
            System.out.println("2. Gestión Clientes");
            System.out.println("3. Gestión Pedido");
            System.out.println("0. Salir");
            opcio = pedirOpcion();
            switch (opcio) {

                case '1':
                    gestionArticulos();
                    break;

                case '2':
                    gestionClientes();
                    break;

                case '3':
                    gestionPedidos();
                    break;

                case '0':
                    salir = true;
            }
        } while (!salir);
    }
    char pedirOpcion() {
        String resp;
        System.out.println("Elige una opción (1,2,3 o 0):");
                resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

    public void gestionArticulos(){
        boolean salir = false;
        char opcio;
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1. Añadir un articulo");
            System.out.println("2. Mostrar los articulos");
            System.out.println("3. Buscar articulo");
            System.out.println("0. Atras");
            opcio = pedirOpcion();
            switch (opcio) {
                case '1':
                    System.out.println("Introduce el codigo del articulo");
                    String codigo = teclado.nextLine();
                    System.out.println("Introduce la descripcion del articulo");
                    String descripcion = teclado.nextLine();
                    System.out.println("Introduce el precio del articulo");
                    double precio = Double.parseDouble(teclado.nextLine());
                    System.out.println("Introduce las horas de preparación del articulo");
                    int tiempoPreparacion = Integer.parseInt(teclado.nextLine());
                    System.out.println("Introduce los gastos de envio del articulo");
                    double gastosEnvio = Double.parseDouble(teclado.nextLine());
                    Articulo articulo = new Articulo(codigo, descripcion, precio, tiempoPreparacion, gastosEnvio);
                    listaArticulos.agregarArticulos(articulo);
                    break;
                case '2':
                    listaArticulos.mostrarArticulos();
                    break;
                case '3':

                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }
    public void gestionClientes(){
        boolean salir = false;
        char opcio;
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1. Añadir un cliente");
            System.out.println("2. Mostrar los clientes");
            System.out.println("3. Buscar clientes");
            System.out.println("0. Atras");
            opcio = pedirOpcion();
            switch (opcio) {
                case '1':

                    break;
                case '2':

                    break;
                case '3':

                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }
    public void gestionPedidos(){
        boolean salir = false;
        char opcio;
        do {
            System.out.println("Que desea hacer?");
            System.out.println("1. Añadir un pedido");
            System.out.println("2. Mostrar los pedidos");
            System.out.println("3. Buscar pedidos");
            System.out.println("0. Atras");
            opcio = pedirOpcion();
            switch (opcio) {
                case '1':

                    break;

                case '2':

                    break;

                case '3':

                    break;

                case '0':
                    salir = true;
            }
        } while (!salir);
    }

}