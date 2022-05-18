/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer42;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int n = teclado.nextInt();
        
        int cc = 0;
        
        while(cc<=n){
            System.out.println(cc);
            cc=cc+1;
        }
        System.out.println("Acabou!!");
    }
}
