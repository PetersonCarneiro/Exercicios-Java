/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer10;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a largura da parede: ");
        float largura = teclado.nextFloat();
        
        System.out.println("Digite a altura da parede: ");
        float altura = teclado.nextFloat();
        
        float area = altura*largura;
        
        float litros=1*2;
        
        float areal= area/litros;
        
        System.out.println("A área total a ser pintada é :"+area+"m²");
        System.out.println("A quantidade de litros necessaria par pintar é: "+areal+" litros");
        
    }
    
}
