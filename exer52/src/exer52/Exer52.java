/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer52;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner teclado = new Scanner(System.in);
        
        int cc =0;
        int total = 0;
        int menor =0;
        int maior =0;
        float media =0 ;
        int menS=0;
        int maiS=0;
      
        
        
        while(cc<=10){
            System.out.println("Quantos anos você tem: ");
            int idade = teclado.nextInt();
            cc=cc+1;
            
            total= total+idade;
            media = total/10; 
            
            if(cc == 1){
                menor=idade;
                maior=idade;
            }
            if(idade<menor){                
                menor=idade;
             }else
            if(idade>maior){
                maior=idade;
             }
            
            if(idade<=5){
                menS=menS+1;
            }else if(idade>=18){
                maiS= maiS+1;
            }
        }
           
        System.out.println("A média de idade: "+media);
        System.out.println("Maior que 18:"+maiS);
        System.out.println("Menor qur 5: "+menS);
        System.out.println("A maior idade lida: "+maior);    
    }    
}
    

