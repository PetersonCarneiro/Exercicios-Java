/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer62;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        double avarege=0;
        int contM=0;
        int cont=0;
        int age;
        do{
            cont++;

            System.out.println("Qual a sua idade: ");
            age = tc.nextInt();
            System.out.println("Deseja continuar[s/n]:");
            char stop = tc.next().charAt(0);
            
            avarege=(avarege+age)/cont;
 
            if(age>=21){
                contM++;
            }
            
            //Comando de parada deve ficar no final.
            if((stop=='n')||(stop=='N') ){
                break;
            }

        }while(true);
        System.out.println("Quantas idades foram digitadas: "+cont);
        System.out.println("A média ditigada é: "+avarege);
        System.out.println("quantas pessoas tem 21 anos o mais: "+contM);
        
    }
    
}
