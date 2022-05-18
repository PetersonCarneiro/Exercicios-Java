/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer49;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
       int cc = 0;
       int aux ;
       boolean resul;
       int par =0;
       int imp = 0;
       
        while (cc<=6){
            
            System.out.println("Digite um número: ");
            int num = teclado.nextInt();
            cc=cc+1;
           
            aux=num%2;
            resul = aux==0;
           
            if(resul == true ){
                par=par+1;
               
            }else if( resul == false){
                imp = imp+1;
            }
        }
        System.out.println("São Ímpares: "+imp);
        System.out.println("São pares: "+par);
    }
    
}
