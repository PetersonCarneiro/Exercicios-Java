/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer55;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        
                
        int cc=1;
        
        while(cc<=4){
            cc=cc+1;
            
            int sorteio = gerador.nextInt(10)+1;
            
            System.out.println("Escolha um número:");
            int numero = teclado.nextInt();

            if(numero==sorteio){
                System.out.println("Acertou!"+sorteio);
            }else 
                System.out.println("Errou!"+sorteio);
        }
        
    }
    
}
