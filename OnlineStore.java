package Controlador;

import java.util.Scanner;

public class OnlineStore {

    Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        OnlineStore prg = new OnlineStore();
        prg.inicio();
    }

    void inicio() {
        boolean salir = false;
        char opcio;
        do {
            System.out.println("");
            System.out.println("1. Añadir vehiculos en una flota");
            System.out.println("2. Mostrar vehiculos de una flota");
            System.out.println("3. Quitar un vehiculo de una flota");
            System.out.println("4. Ejemplo solución AA1");
            System.out.println("0. Salir de la aplicación");
            opcio = demanarOpcioMenu();
            switch (opcio) {
                case '1':

                    break;
                case '2':

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

    char demanarOpcioMenu() {
        String resp;
        System.out.print("Elige una opción (1,2,3,4 o 0): ");
        resp = teclado.nextLine();
        if (resp.isEmpty()) {
            resp = " ";
        }
        return resp.charAt(0);
    }

}
