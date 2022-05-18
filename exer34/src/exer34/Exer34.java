/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer34;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual é sua altura: ");
        float alt = teclado.nextFloat();
        
        System.out.println("Qual é o seu peso: ");
        float peso = teclado.nextFloat();
        
       double resul = (peso/(Math.pow(alt, 2)));
        
        
        if(resul<=18.5){
            System.out.println("IMC: "+resul);
            System.out.println("abaixo do peso!");
        }else if (resul>18.5 && resul<=25){
            System.out.println("IMC: "+resul);
            System.out.println("Peso Ideal");
        }else if (resul>25 && resul<=30){
            System.out.println("IMC: "+resul);
            System.out.println("Sobrepeso");
        }else if (resul>30 && resul<=40){
            System.out.println("IMC: "+resul);
            System.out.println("Obesidade");
        }else if (resul>40){
            System.out.println("IMC: "+resul);
            System.out.println("Obesidade Mórbida");
        }    
    }
}
