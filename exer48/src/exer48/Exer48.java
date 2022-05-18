/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer48;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado =new Scanner(System.in);
        
        int cc=1;
        int resul =0;
        int aux = 0;
        while(cc<=5){
            System.out.println("Digite um número: ");
            int num = teclado.nextInt();
            cc=cc+1;

            aux = num;
            num = aux;
            resul = num+resul;
            
        }
        System.out.println("Resultado: "+resul);
    }
    
}
