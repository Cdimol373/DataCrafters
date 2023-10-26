package datacrafters.vista;

import datacrafters.controlador.Controlador;
import java.util.Scanner;

public class GestionOS {

    private Controlador controlador;
    Scanner teclado = new Scanner(System.in);

    public GestionOS() {
        controlador = new Controlador();
    }

    public void inicio() {
        boolean salir = false;
        char opcion;

        do {
            System.out.println("1. Gestión Articulos");
            System.out.println("2. Gestión Clientes");
            System.out.println("3. Gestión Pedidos");
            System.out.println("0. Salir");
            opcion = pedirOpcion();
            switch (opcion) {
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

    void gestionArticulos() {
        boolean salir = false;
        char opcion;

        do {
            System.out.println("1. Añadir Articulos");
            System.out.println("2. Mostrar Articulos");
            System.out.println("0. Salir");
            opcion = pedirOpcionGestionArticulos();
            switch (opcion) {
                case '1':
                    añadirArticulo();
                    break;
                case '2':
                    mostrarArticulo();
                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }

    char pedirOpcionGestionArticulos() {
        String resp;
        System.out.println("Elige una opción (1,2 o 0):");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

    void añadirArticulo() {
    }

    void mostrarArticulo() {
    }

    void gestionClientes() {
        boolean salir = false;
        char opcion;

        do {
            System.out.println("1. Añadir Clientes");
            System.out.println("2. Mostrar Clientes");
            System.out.println("3. Mostrar Clientes Estandar");
            System.out.println("4. Mostrar Clientes Premium");
            System.out.println("0. Salir");
            opcion = pedirOpcionGestionArticulos();
            switch (opcion) {
                case '1':
                    añadirCliente();
                    break;
                case '2':
                    mostrarCliente();
                    break;
                case '3':
                    mostrarClienteEstandard();
                    break;
                case '4':
                    mostrarClientePremium();
                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }

    char pedirOpcionGestionClientes() {
        String resp;
        System.out.println("Elige una opción (1,2 o 0):");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

    void añadirCliente() {
    }

    void mostrarCliente() {
    }

    void mostrarClienteEstandard() {

    }

    void mostrarClientePremium() {

    }

    void gestionPedidos() {
        boolean salir = false;
        char opcion;

        do {
            System.out.println("1. Añadir Pedido");
            System.out.println("2. Eliminar Pedido");
            System.out.println("3. Mostrar Pedido Enviado");
            System.out.println("4. Mostrar Pedido En Curso");
            System.out.println("0. Salir");
            opcion = pedirOpcionGestionPedidos();
            switch (opcion) {
                case '1':
                    añadirPedido();
                    break;
                case '2':
                    eliminarPedido();
                    break;
                case '3':
                    mostrarPedidoEnviado();
                    break;
                case '4':
                    mostrarPedidoEnCurso();
                    break;
                case '0':
                    salir = true;
            }
        } while (!salir);
    }

    char pedirOpcionGestionPedidos() {
        String resp;
        System.out.println("Elige una opción (1,2 o 0):");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

    void añadirPedido() {
    }

    void eliminarPedido() {
    }

    void mostrarPedidoEnviado() {
    }

    void mostrarPedidoEnCurso() {
    }
}

