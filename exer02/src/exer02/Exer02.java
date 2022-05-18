/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        String nome;
        System.out.println("Qual o seu nome:");
        nome = teclado.nextLine();
        
        System.out.println("Seja bem vindo Sr."+ nome);
                
    }
    
    
    
    
}
