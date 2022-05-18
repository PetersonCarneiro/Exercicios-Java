/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer.pkg19;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o seu nome: ");
        String nome = teclado.next();
        
        System.out.println("Nota 01: ");
        int n1 = teclado.nextInt();
        
        System.out.println("Nota 02: ");
        int n2 = teclado.nextInt();
        
        int soma = n1+n2;
        float resul = soma/2;
        
        if(resul >= 7 ){
            System.out.println(nome);
            System.out.println("Teve um bom aproveitamento");
            System.out.println("Sua nota foi "+resul);
        }else if(resul < 7){ 
            System.out.println(nome);
            System.out.println("Não teve um bom aproveitamento");
            System.out.println("Sua nota foi: "+resul);
        }
    }
    
}
