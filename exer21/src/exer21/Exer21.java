/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer21;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual é o ano: ");
        int ano = teclado.nextInt();
        
        float bi =ano%4;
        
        if(bi==0){
            float bi2 = ano%100;
            if (bi2 != 0){
                System.out.println("É bissexto!"+bi2);
            }
        }else if(bi!=0) 
        
        System.out.println("Não é bissexto!");
    }
    
}
