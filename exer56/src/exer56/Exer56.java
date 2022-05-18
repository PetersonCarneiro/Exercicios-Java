/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer56;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int cont = 1;
       
        int soma=0;
        
        while(true){
            cont=cont+1;
            System.out.println("Escreva uma nota: ");
            int op = teclado.nextInt();
            if (op==1111){
                break;                
            }else{
            soma = soma+op;
            }
        }
        System.out.println("resultado: "+soma);
    }
    
}
