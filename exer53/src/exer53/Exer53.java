/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer53;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner(System.in);
        
        int masc = 0;
        int fem = 0;
        float media =0;
        float mediaMasc = 0;
        int femMais = 0;
        int somaMasc=0;
        int soma = 0;
        
        int cc=1;
        while(cc<=5){
            cc=cc+1;
            
           //a) Quantos homens foram cadastrados
           //b) Quantas mulheres foram cadastradas
            System.out.println("Qual sua idade:");
            int idade = teclado.nextInt();

            System.out.println("Qual o seu genêro:(m/f):");
            String genero = teclado.next();
            
            if("m".equals(genero)){
                masc = masc+1;
                    somaMasc = somaMasc+idade;
                    mediaMasc = somaMasc/masc;
            }else if("f".equals(genero)){
                fem = fem +1;
                if(idade>20){
                    femMais = femMais+1;
                }
            }
            //c) A média de idade do grupo
            soma = soma+idade;
            media = soma/5;
            //d) A média de idade dos homens
            
        }
        System.out.println("Quanto homens foram cadastrados: "+masc);
        System.out.println("Quanto homens foram cadastrados: "+fem);
        System.out.println("A média de idade do grupo é : "+media);
        System.out.println("a media de idade entre os homens: "+mediaMasc);
        System.out.println("A quantidade de mulheres acima de 20 anos é:"+femMais);
        
    }
    
}
