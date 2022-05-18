/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer09;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Carteira: ");
        float reais = teclado.nextFloat();
        
        double r= 0.29;
        double dolar = r*reais;
        
        System.out.println("podera comprar :"+dolar);
    }
    
    
    
}
