/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer03;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer03 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //variaveis
        String nome,mes;
        float salario;
       
        System.out.println("Qual o nome da funcionaria: ");
        nome = teclado.nextLine();
        
        System.out.println("mês: ");
        mes = teclado.nextLine();
        
        System.out.println("Qual o salário: ");
        salario = teclado.nextFloat();
        

        
        System.out.println("");
        System.out.println("O funcionário(a) "+nome+" tem um salário de "+salario+" no "+mes);
        
        
    }
    
}
