/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer25;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Primeiro segmento:");
        int seg1 = teclado.nextInt();
        System.out.println("Segundo segmento:");
        int seg2 = teclado.nextInt();
        System.out.println("Terceiro segmento:");
        int seg3 = teclado.nextInt();
       
        boolean resul = (seg1 + seg2 < seg3) && (seg1 + seg3 < seg2) && (seg2 + seg3 < seg1);
        if(resul=true){
            System.out.println("Os 3 lados formam um triângulo");
        }else
            System.out.println("Os 3 lados não formam um triângulo");
        
    }
    
}
