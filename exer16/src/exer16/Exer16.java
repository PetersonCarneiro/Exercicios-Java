/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer16;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantidade de cigarros fumados por dia: ");
        int cigarro = teclado.nextInt();
        
        System.out.println("Quantos anos fumando? ");
        int anos = teclado.nextInt();
        
        int ano = 10*anos*365*cigarro;
        int dia = ano/(24*60);
        
        
        System.out.println(dia);
    }
    
}
