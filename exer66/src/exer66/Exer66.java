/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer66;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc=new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number = tc.nextInt();
        
        for(int cc=0;cc<=10;cc=cc+1){
            int mult=number*cc;
            System.out.println(number+"x"+cc+"="+mult);
        }
    }
    
}
