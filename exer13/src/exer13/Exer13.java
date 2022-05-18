/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer13;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o salário atual: ");
        float salario = teclado.nextFloat();
        
        float por = salario*15/100;
        float resul = salario+por;
        
        System.out.println("O salário com acrescimo de 15% é: "+resul);
    }
    
}
