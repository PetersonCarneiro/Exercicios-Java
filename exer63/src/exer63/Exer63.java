/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer63;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        int sum=0;
        double avarege=0;
        int pair=0;
        int pairR=0;
        int bigger=0;
        int smaller=0;
        
        int cont=0;
        do{
            cont++;
            System.out.println("Enter a number: ");
            int number = tc.nextInt();
            System.out.println("Do you wish to continue[y/n]:");
            char stop =tc.next().charAt(0);
            
            sum=sum+number;
            avarege=sum/cont;
            pair=number%2;
            
            if(pair==0){
                pairR++;
            }
            
            if(cont==1){
                bigger=number;
                smaller=number;
            }
            if(number<smaller){
                smaller=number;
            }else if (number>bigger){
                bigger=number;
            }

            if(stop=='n'){
                break;
            }
            
        }while(true);
        
        System.out.println("The sum of the values: "+sum);
        System.out.println("What wat the smallest value entered: "+smaller);
        System.out.println("The avarege of all values:"+avarege);
        System.out.println("How many valoues are pairs: "+pairR);
    }
    
}
