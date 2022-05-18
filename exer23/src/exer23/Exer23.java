/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer23;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o seu nome: ");
        String nome = teclado.next();
        System.out.println("Qual o seu genêro [M][F]: ");
        String gen = teclado.next();
        System.out.println("Valor da compra: ");
        float valor = teclado.nextFloat();
        
        if("M".equals(gen)){
            float valorM = (valor*5/100)+valor;
            System.out.println("O valor do seu desconto Sr."+nome+" é "+valorM);
        }else if("F".equals(gen)){
            float valorF = (valor*13/100)+valor;
            System.out.println("O valor do seu desconto Sra."+nome+" é "+valorF);
        }
        
    }
    
}
