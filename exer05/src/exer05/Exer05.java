/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer05;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    //0variavais
    float nota1, nota2, soma;
    float media;
    
        System.out.println("Nota 01 : ");
        nota1 = teclado.nextFloat();
        
        System.out.println("Nota 02: ");
        nota2 = teclado.nextFloat();
        
        soma = nota1 + nota2;
        media = soma/2;
        
        System.out.println("A media entre "+nota1+" e "+nota2+" é igual á: "+media);
    
    
    }
    
}
