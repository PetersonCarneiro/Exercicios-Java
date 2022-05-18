/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer54;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer54 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        float soma=0;
        float media=0;
        int somaPeso=0;
        int somaPesoAlt=0;
        int somaPesoAlt2=0;
        
        int cc=1;
        while(cc<=3){
            cc=cc+1;
            System.out.println("Qual o seu peso: ");
            float peso = teclado.nextFloat();
            
            System.out.println("Qual sua altura: ");
            float alt = teclado.nextFloat();
            
            soma = soma+alt;
            media=soma/3;
            
            if(peso>=90){
                somaPeso=somaPeso+1;
            }else if (peso<=50&&alt<160){
                somaPesoAlt = somaPesoAlt+1;
            }
            if(peso>=100&&alt>=190){
                somaPesoAlt2 = somaPesoAlt2+1;
            }
        }
        System.out.println("Qual a média de altura do grupo:"+media);
        System.out.println("A quantidade de pessoas acima de 90kg:"+somaPeso);
        System.out.println("A quantidade de  pessoas que pesam menos de 50Kg tem menos de 1.60m:"+somaPesoAlt);
        System.out.println("A quantidade de pessoas que medem mais de 1.90m pesam mais de 100Kg:"+somaPesoAlt2);
    }
    
}
