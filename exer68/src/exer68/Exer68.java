/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer68;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        int woman=0;
        int man=0;
        int womanWeight=0;
        float womanAverage=0;
        int manW = 0;
        int bigger=0;
        int smaller=0;
        
        for(int cc=1;cc<=8;cc++){
            
            System.out.println("Whats is your gender[m/f]: ");
            char gen = tc.next().charAt(0);

            System.out.println("Whats is your weight: ");
            int weight = tc.nextInt();

            if((gen=='f')||(gen=='F')){
                woman = woman+1;
                
                womanWeight=womanWeight+weight;
                womanAverage=womanWeight/woman;
            }
            
            if((gen=='m')||(gen=='M')){
                man = man+1; 
                
                if(weight>=100){
                    manW=manW+1;
                }
                
                if(cc==1){
                    bigger=weight;
                    smaller=weight;
                }
                if(weight<smaller){
                    smaller=weight;
                }else if(weight>bigger){
                    bigger=weight;
                }
            }
  
        }
        System.out.println("How many woman were registered: "+woman);
        System.out.println("How many men weigh over 100kg: "+manW);
        System.out.println("The average weight among woman:"+womanAverage);
        System.out.println("The heaviest weight among man:"+bigger);
    }
    
}
