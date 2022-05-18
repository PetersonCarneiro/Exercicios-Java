/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer36;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantas hora de exercícios vc realizou: ");
        float horas = teclado.nextFloat();
        
        
        if(horas <= 10 ){
            float pontos = horas*2;
            double total = pontos*0.05;
            System.out.println("Sua quantidade de ponto é "+pontos+", e o total a receber é:R$"+total);
        }else if(horas >10 && horas <20 ){
            float pontos = horas*5;
            double total = pontos*0.05;
            System.out.println("Sua quantidade de ponto é "+pontos+", e o total a receber é:R$"+total);
        }else if(horas >=20 ){
            float pontos = horas*10;
            double total = pontos*0.05;
            System.out.println("Sua quantidade de ponto é "+pontos+", e o total a receber é:R$"+total);
        }
    }
    
}
