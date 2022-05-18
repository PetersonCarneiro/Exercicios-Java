/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer04;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    //variavais
    int valor1, valor2, resultado; 
    
    
    System.out.println("Digite um valor: ");
    valor1 = teclado.nextInt();
    
    System.out.println("Digite um valor: ");
    valor2 = teclado.nextInt();
    
    resultado = valor1+valor2;
    
    System.out.println("A soma entre "+valor1+" e "+valor2+" é igual a: "+resultado );
    }

    
    
    
}
