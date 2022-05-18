/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer15;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantidade de dias: ");
        int dias = teclado.nextInt();
        
        float pdia = 8*25;
        float pmes =dias*pdia;
        
        System.out.println("O valor a ser pago: "+pmes);
    }
    
    
    
    
}
