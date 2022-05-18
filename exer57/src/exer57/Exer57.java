/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer57;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        while(true){
            System.out.println("Qual o salário: ");
            double sal = tc.nextDouble();
            System.out.println("Qual o seu genero: ");
            String gen = tc.next();
            System.out.println("Quer continuar:[s/n]: ");
            char parar = tc.next().charAt(0);
            
            if(parar=='n'){
                break;
            }
        }
    }
    
}
