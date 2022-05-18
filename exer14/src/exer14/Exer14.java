/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer14;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantidade de Km percorrido: ");
        float km = teclado.nextFloat();
        
        System.out.println("Qunatidade de dias: ");
        int dias = teclado.nextInt();
        
        double pork = km*0.20; 
        int pord = dias*90;
        float resul = km*dias;
        
        System.out.println("por km: "+pork);
        System.out.println("Por dia: "+pord);
        System.out.println("total: "+resul);
        
    }
    
}
