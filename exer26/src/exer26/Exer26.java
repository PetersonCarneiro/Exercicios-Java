/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer26;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner teclado = new Scanner(System.in);
       
        System.out.println("Digite um número: ");
        int n1 = teclado.nextInt();
        System.out.println("Digite um número: ");
        int n2 = teclado.nextInt();
        
        boolean r1 = n1>n2;
        boolean r2 = n2>n1;
        boolean r3 = n1==n2;
        /*
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
       */
       if(r1==true){
           System.out.println("O primeiro valor é maior!");
       }else if(r2==true){
           System.out.println("O segundo valor é maior!");
       }else if(r3==true){
           System.out.println("Não existe valor maior, os dois são iguais");
       }
    }
    
}
