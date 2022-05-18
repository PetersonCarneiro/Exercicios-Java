/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer67;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = tc.nextInt();
        System.out.println("");
        for(int cc=0;cc<=number;cc++){
            
            System.out.print(cc+",");
            
        }
        System.out.println("Fim!");
        
    }
    
}
