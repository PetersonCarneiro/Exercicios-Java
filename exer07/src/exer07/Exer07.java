/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer07;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a 
sua terça parte.
Ex: 
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666*/
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        float n1 = teclado.nextFloat();
        
        float dobro = n1*2;
        float terca = n1/3;
        
        System.out.println("O dobro de "+n1+" é "+dobro);
        System.out.println("A terça parte de "+n1+" é "+terca);
        
    }
    
}
