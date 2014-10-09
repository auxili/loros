/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.util.Scanner;
import view.Vista;

/**
 *
 * @author Papi
 */
public class Main {
    public static void main (String[]args){
        System.out.println("Wellcome to the loros apocalipisis menu interface ou yea");
        System.out.println("Pulse una tecla para continuar");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
                
        Vista.menu();
    }
    
}
