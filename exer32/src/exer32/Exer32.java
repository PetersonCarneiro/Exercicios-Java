/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer32;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        
        
        int sorteio=gerador.nextInt(9)+1;
        
        System.out.println("Escolha um número: ");
        int n = teclado.nextInt();
        
        if(n==sorteio){
            System.out.println("Acertou!"+sorteio);
        }else 
            System.out.println("Errou!"+sorteio);
    }
    
}
