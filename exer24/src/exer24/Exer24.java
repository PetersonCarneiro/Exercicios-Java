/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer24;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Distância percorida: ");
        float dist = teclado.nextFloat();
        
        if(dist<=200){
            double menorDistancia=dist*0.50;
            System.out.println("O valor da passagem é "+menorDistancia);
        }else if (dist>200){
            double maiorDistancia = dist*0.45; 
            System.out.println("O valor da passagem é "+maiorDistancia);
        }
        
        
    }
    
}
