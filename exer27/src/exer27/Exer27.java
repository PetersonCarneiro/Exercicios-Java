/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer27;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota:");
        float n1 = teclado.nextFloat();
        
        System.out.println("digite a segunda nota:");
        float n2 = teclado.nextFloat();
        
        float resul = (n1+n2)/2;
        
        if(resul<=4.9){
            System.out.println("Reprovado!");
        }else if((resul > 5.0)&&(resul< 6.9)){
            System.out.println("Recuperação!");
        }else if (resul>7.0){
            System.out.println("Aprovado!");
        }
    }
    
}
