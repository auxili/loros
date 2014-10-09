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
        System.out.println("0. Salir");

    }

    public static void choose() {
        int opcion;
        boolean errorMenu;
        Scanner scanner = new Scanner(System.in);
        do {
            errorMenu = false;
            menu();
            try {
                opcion = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("opcion incorrecta");
                errorMenu = true;
            }
            switch (opcion) {
                case 1:
                    method1();
                    break;
                case 2:
                    method2();
                    break;
                default:
                    opcion = 1;
                    break;
            }
        } while (opcion != 0 && errorMenu == false);
    }

}
