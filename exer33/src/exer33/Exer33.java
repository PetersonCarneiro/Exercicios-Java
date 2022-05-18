/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer33;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o valor da casa: ");
        float valor = teclado.nextFloat();
        
        System.out.println("Qual o salário do compardor: ");
        float sal = teclado.nextFloat();
        
        System.out.println("Em quantos anos pretende pagar: ");
        float anos = teclado.nextFloat();
        
        anos = anos*12;
        
        float prest= valor/anos;
        float resul=sal*30/100;
        
        if(prest>resul){
            System.out.println("valor da prestação: "+prest);
            System.out.println("Valor da porcentagem: "+resul);
            System.out.println("negado");
        }else if(prest<resul){
            System.out.println("valor da prestação: "+prest);
            System.out.println("Valor da porcentagem: "+resul);
            System.out.println("permitido");
        }
        
    }
    
}
