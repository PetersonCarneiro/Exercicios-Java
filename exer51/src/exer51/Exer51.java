/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer51;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        int cc=0;
        float maior = 0;
        float menor =0;
        
        while (cc<=3){
            System.out.println("Digite o valor do produtos: ");
            float valor = teclado.nextFloat();
            cc=cc+1;
            
            if(cc==1){
                maior= valor;
                menor = valor;        
            }
            
            if(valor >maior){
                maior = valor;
            }else if(valor<menor){
                menor=valor;
            }         
        }
        System.out.println("O produto mais caro é: "+maior);
        System.out.println("O produto menos caro é: "+menor);
    }
    
}
