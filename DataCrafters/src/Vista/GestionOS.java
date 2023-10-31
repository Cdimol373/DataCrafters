package Vista;

import Controlador.Controlador;
import Modelo.*;
import java.util.InputMismatchException;
import java.time.format.DateTimeParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class GestionOS {
    private Controlador controlador;
    Scanner teclado = new Scanner(System.in);

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
                    controlador.crearArticulo(codigo, descripcion, precio, tiempoPreparacion, gastosEnvio);
                    break;
                case '2':
                    controlador.mostrarArticulos();
                    break;
                case '3':
                    Articulo articuloEncontrado = null;
                    while (articuloEncontrado == null) {
                        System.out.println("Introduce el código del artículo que quieres buscar:");
                        codigo = teclado.nextLine();
                        articuloEncontrado = controlador.buscarPorCodigo(codigo);

                        if (articuloEncontrado == null) {
                            System.out.println("El articulo " + codigo + " no existe. Ingresa otro código.");
                        } else {
                            System.out.println(articuloEncontrado);
                        }
                    }
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
            System.out.println("3. Buscar un cliente");
            System.out.println("0. Atras");
            opcio = pedirOpcion();
            switch (opcio) {
                case '1':
                    System.out.println("Que tipo de cliente se va a registrar? Pulsa S para estándar o P para premium");
                    String tipoCliente = teclado.nextLine();
                    System.out.println("Introduce el nombre del cliente");
                    String nombre = teclado.nextLine();
                    System.out.println("Introduce el domicilio del cliente");
                    String domicilio = teclado.nextLine();
                    System.out.println("Introduce el nif del cliente");
                    String nif = (teclado.nextLine());
                    System.out.println("Introduce el email del cliente");
                    String email = (teclado.nextLine());

                    Cliente cliente;

                    if(tipoCliente.equalsIgnoreCase("S")){
                        cliente = new ClienteEstandar(nombre,domicilio,nif,email);
                    }else if (tipoCliente.equalsIgnoreCase("P")){
                        cliente = new ClientePremium(nombre,domicilio,nif,email);
                    } else {
                        System.out.println("Este tipo de cliente no es válido.");
                        return;
                    }
                    controlador.crearCliente(cliente);
                    break;
                case '2':
                    controlador.mostrarClientes();
                    break;
                case '3':
                    System.out.println("Introduce el nif del cliente que quieres buscar:");
                    nif = teclado.nextLine();
                    Cliente clienteEncontrado = controlador.buscarPorNIF(nif);

                    if (clienteEncontrado != null) {
                        System.out.println(clienteEncontrado);
                    } else {
                        System.out.println("El cliente con el nif " + nif + " no existe.");
                    }
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
            System.out.println("3. Buscar pedidos por cliente");
            System.out.println("4. Buscar pedidos por numero de pedido");
            System.out.println("0. Atras");
            opcio = pedirOpcion();
            switch (opcio) {
                case '1':
                    System.out.println("Introduce el número del pedido");
                    int numeroPedido = Integer.parseInt(teclado.nextLine());

                    boolean nifValido = false;
                    Cliente clienteEncontrado = null;
                    while (!nifValido){
                    System.out.println("Introduce el nif del cliente que hace el pedido");
                    String nif = teclado.nextLine();
                    clienteEncontrado = controlador.buscarPorNIF(nif);
                    if (clienteEncontrado == null) {
                        System.out.println("El cliente con el nif " + nif + " no existe. Ingresa un nif válido.");
                    }else {
                        nifValido = true;
                    }
                    }

                    boolean codigoValido = false;
                    Articulo articuloEncontrado = null;
                    while (!codigoValido){
                    System.out.println("Introduce el codigo del articulo");
                    String codigo = teclado.nextLine();
                    articuloEncontrado = controlador.buscarPorCodigo(codigo);
                    if (articuloEncontrado == null) {
                        System.out.println("El articulo con el código " + codigo + " no existe.");
                    } else {
                        codigoValido = true;
                    }
                    }

                    System.out.println("Introduce la cantidad");
                    int cantidad = Integer.parseInt(teclado.nextLine());

                    boolean fechaValida = false;
                    LocalDateTime fechaHora = null;
                    while (!fechaValida) {
                        try {
                            System.out.println("Introduce la fecha del pedido (formato: yyyy-MM-dd HH:mm):");
                            String fechaHoraStr = teclado.nextLine();
                            fechaHora = LocalDateTime.parse(fechaHoraStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                            fechaValida = true;
                        } catch (DateTimeParseException e) {
                            System.out.println("Fecha no válida. Por favor, ingrese la fecha en el formato correcto (yyyy-MM-dd HH:mm).");
                        } catch (Exception e) {
                            System.out.println("Ocurrió un error: " + e.getMessage());
                        }
                    }

                    boolean enviado =false;
                    controlador.crearPedido(numeroPedido, clienteEncontrado, articuloEncontrado, cantidad, fechaHora,enviado);
                    break;

                case '2':
                    controlador.mostrarPedidos();
                    break;

                case '3':

                    break;

                case '4':

                    break;

                case '0':
                    salir = true;
            }
        } while (!salir);
    }

}