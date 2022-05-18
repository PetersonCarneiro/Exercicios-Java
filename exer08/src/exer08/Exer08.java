/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer08;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um distância em metros: ");
        float metros = teclado.nextFloat();
        
        float mm = metros*1000;
        float cm = metros*100;
        float dm = metros*10;
        
        float dam = metros/10;
        float hm = metros/100;
        float km = metros/1000;
        
        System.out.println("A distância de "+metros+"m corresponde a: ");
        System.out.println(km);
        System.out.println(hm);
        System.out.println(dam);
        System.out.println(dm);
        System.out.println(cm);
        
    }
    
    
    
}
