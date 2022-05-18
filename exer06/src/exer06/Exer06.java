/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer06;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = teclado.nextInt();
        
        int r1 = numero-1;
        int r2 = numero+1;
        
        System.out.println("O antecessor de "+numero+" é :"+r1);
        System.out.println("O sucessor de "+numero+" é: "+r2);
        
    }
    
}
