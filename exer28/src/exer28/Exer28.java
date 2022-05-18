/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer28;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Largur do terreno:");
        float larg = teclado.nextFloat();
        
        System.out.println("Comprimento do terreno:");
        float comp = teclado.nextFloat();
        
        float resul = larg*comp;
        
        if (resul<=100) {
            System.out.println("Terreno popular");
            System.out.println(resul+"m2");
        }else if ((resul>100)&&(resul<500)) {
            System.out.println("Terreno master");
            System.out.println(resul+"m2");
        }else if (resul>=500) {
            System.out.println("Terrno vip");
            System.out.println(resul+"m2");
        }
    }
    
}
