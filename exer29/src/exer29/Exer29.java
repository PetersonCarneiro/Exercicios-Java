/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer29;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Nome do funcionário: ");
        String func = teclado.next();
        
        System.out.println("Qual o salário: ");
        float sal = teclado.nextFloat();
        
        System.out.println("Quanto anos de empresa; ");
        float anos = teclado.nextFloat();
        
        if(anos <= 3){
            float tresporc = (sal*3/100)+sal;
            System.out.println("Novo salário: "+tresporc);
        }else if ((anos>3)&&(anos<10)){
            double entre = (sal*12.5/100)+sal;
            System.out.println("Novo salário: "+entre);
        }else if (anos>10){
            float dezporc = (sal*20/100)+sal;
            System.out.println("Novo salário: "+dezporc);
        }
    }
    
}
