/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer11;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Valor de a:");
        int a = teclado.nextInt();
        
        System.out.println("Valor de b:");
        int b = teclado.nextInt();
        
        System.out.println("Valor de c:");
        int c = teclado.nextInt();
        
        int delta = b^2 - 4 * a * c;
        
        System.out.println("O valor de delta é: "+delta);
        
        
    }
    
}
