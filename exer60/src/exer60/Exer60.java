/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer60;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner (System.in);
        
        int cont=0;
        int menor=0;
        int maior=0;
        String nomeVelha= null;
        String mJovem=null;
        float media=0;
        int contM=0;
        int contF=0;
        
        while(true){
            cont+=1;
            
            System.out.println("Qual o seu nome: ");
            String nome = tc.next();
            System.out.println("Qual a sua idade: ");
            int idade = tc.nextInt();
            System.out.println("Qual o genero: ");
            char gen = tc.next().charAt(0);
            System.out.println("Deseja continuar [s/n]:");
            char stop=tc.next().charAt(0);
            
            if(stop=='n'){
                break;
            }
            
            if(cont==1){
                menor = idade;
                maior = idade;
            }
            if (idade<menor){
                menor=idade;
            }else if (idade>maior){
                    maior=idade;
                    nomeVelha=nome;
            }
            
            if((gen=='f')&&(idade==menor)){
                mJovem=nome;
            }
            
            media=(media+idade)/cont;
            
            if((gen=='m')&&(idade>=30)){
                contM+=1;
            }else if((gen=='f')&&(idade<=18)){
                contF+=1;
            }
        }
            System.out.println("A pessoa mais velha é:"+nomeVelha);
            System.out.println("O nome da mulher mais jovem "+mJovem);
            System.out.println("a media do grupo é :"+media);
            System.out.println("Qunatos homens tem mais de 30 anos"+contM);
            System.out.println("Quantas Mulher tem menos de 18 anos "+contF);
    }
}
