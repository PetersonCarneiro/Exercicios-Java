/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer69;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        float pa;
        double sum=0;
        System.out.println("Qual o promeiro termo da PA:");
        int a = tc.nextInt();
        System.out.println("Qual a razão da PA:");
        int r =tc.nextInt();
        
        for(int cc=0;cc<=10;cc++){
            pa=a+(cc-1)*r;
            System.out.println(pa);
            
            sum=sum+pa;
            
                    
        }
        System.out.printf("The sum PA of the: %.2f",sum);
        System.out.println("");
    }
    
}
