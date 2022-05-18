/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer59;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        int cont=0;
        int maior=0;
        int menor=0;
        float media=0;
        int men=0;
        float mediaMen=0;
        String name;
        String nameFem = null;
        int ageFem=0;
        
        while(true){
            cont+=1;
            System.out.println("Qual o seu nome: ");
            name=tc.next();

            System.out.println("Qual a sua idade: ");
            int age = tc.nextInt();
        
            System.out.println("Qual o seu genero[m/f]");
            char gen = tc.next().charAt(0);
            
            System.out.println("Deseja continuar:[s/n]");
            char stop = tc.next().charAt(0);
            
            media=(media+age)/cont;
            
            if(stop=='n'){
                break;
            }else{
                if(cont==1){
                maior=age;
                menor=age;           
                }
                if(age>maior){
                    maior=age;
                }else if(age<menor){
                    menor=age;
                    
                }
                
                if(gen=='m'){
                    men+=1;
                    mediaMen=(mediaMen+age)/men;
                    
                }else if((gen=='f')&&(age==menor)){
                        nameFem=name;
                        ageFem=menor;
                }     
            }
        }
        System.out.println("A média de idade do grupo é: "+media);
        System.out.println("Quantos homens foram cadastrados: "+men);
        System.out.println("A mulher mais joven é: " +nameFem+" e a idade dela "+ ageFem);
        System.out.println("A media de idade entre os homens: "+mediaMen);
    }
    
}
