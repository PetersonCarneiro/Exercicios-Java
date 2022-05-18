/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer37;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual o seu salário atual: ");
        float sal = teclado.nextFloat();
        
        System.out.println("Qual o seu gênero:[mulher(1)] ou [Homem(2)] ");
        int gen = teclado.nextInt();
        
        System.out.println("A quanto tempo trabalha na empresa: ");
        float temp = teclado.nextFloat();
        
        if(gen == 1){
            if(temp<=15){
                float nSal= (sal*5/100)+sal;
                System.out.println("Seu novo salário é: "+nSal);
            }else if (temp>15 && temp<20){
                float nSal= (sal*12/100)+sal;
                System.out.println("Seu novo salário é: "+nSal);
            }else if(temp>=20){
                float nSal= (sal*23/100)+sal;
                System.out.println("Seu novo salário é: "+nSal);
            }
        }else if (gen == 2){
            if(temp<=20){
                float nSal= (sal*3/100)+sal;
                System.out.println("Seu novo salário é: "+nSal);
            }else if (temp>20 && temp<30){
                float nSal= (sal*13/100)+sal;
                System.out.println("Seu novo salário é: "+nSal);
            }else if(temp>=30){
                float nSal= (sal*25/100)+sal;
                System.out.println("Seu novo salário é: "+nSal);
            }
        }
    }
    
}
