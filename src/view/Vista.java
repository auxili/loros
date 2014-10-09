/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Papi
 */
public class Vista {

    public Vista() {
    }

    public static void menu() {
        System.out.println("1. Cargar loros en el sistema");
        System.out.println("2. Introducir loro");
        System.out.println("3. Modificar loro");
        System.out.println("4. Eliminar loro");
        System.out.println("//// Pruebas Científicas ////");
        System.out.println("5. Realizar prueba científica en loro");
        System.out.println("6. Indicar resultado de prueba científica");
        System.out.println("7. Buscar loros por Id en el sistema");
        System.out.println("//// Listados ////");
        System.out.println("8. Loros sin pruebas científicas");
        System.out.println("9. Loros de un mismo color");
        System.out.println("10.Loros si todas pruebas incorrectas ");
        System.out.println("11.Pruebas no realizadas a ningun loro");
        System.out.println("12.Loros del mismo tamaño");
        System.out.println("13.Guardar");
        System.out.println("0. Salir");
        System.out.println("selccione una opción");

    }

    public static void choose() {
        menu();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        int opcion;

        do {
            menu();
            try {
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("opcion 1");
                    break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                case 4:
                    System.out.println("opcion 4");
                    break;
                case 5:
                    System.out.println("opcion 5");
                    break;
                case 6:
                    System.out.println("opcion 6");
                    break;
                case 7:
                    System.out.println("opcion 7");
                    break;
                case 8:
                    System.out.println("opcion 8");
                    break;
                case 9:
                    System.out.println("opcion 9");
                    break;
                case 10:
                    System.out.println("opcion 10");
                    break;
                case 11:
                    System.out.println("opcion 11");
                    break;
                case 12:
                    System.out.println("opcion 12");
                    break;
                case 13:
                    System.out.println("opcion 13");
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            }catch (Exception e){
                System.out.println("Opcion incorrecta");
                quit = true;
            }
        } while (!quit);
    }

}
