/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer12;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o preço do produto: ");
        float preco = teclado.nextFloat();
        
        float promo = preco*5/100;
        float p2 = promo+preco; 
        
        System.out.println("O valor do poduto com desconto: "+p2);
        
        
    }
    
}
