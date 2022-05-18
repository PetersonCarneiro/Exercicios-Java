/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer44;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor inicial: ");
        int ini =teclado.nextInt();
        
        System.out.println("Digite o valor final: ");
        int fim = teclado.nextInt();
        
        System.out.println("Digite o incremento: ");
        int inc = teclado.nextInt();
        
        
        if(ini<fim){
            int cc = ini;
            while (cc<=fim){
                System.out.println(cc);
                cc=cc+inc;
            }
        }else if(fim<ini){
            System.out.println("teste");
            int cc = ini;
            while (cc>=fim){
                System.out.println(cc);
                cc=cc-inc;  
            }
        }
        System.out.println("Acabau!");
    }
    
}
