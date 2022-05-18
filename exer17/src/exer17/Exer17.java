/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer17;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual a velocida do carro: ");
        int velocidade = teclado.nextInt();
        
        if(velocidade >80){
            int multa=(velocidade-80)*5;
            System.out.println("Você foi multado, o valor da multa é:"+multa);
        }else
            System.out.println("Você esta dentro da velocidade!");
    }
    
}
