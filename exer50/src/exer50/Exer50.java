/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer50;

import java.util.Random;

/**
 *
 * @author peter
 */
public class Exer50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        int acima = 0;
        int div = 0;
        
        while(cc<=20){
            int sorteio = new Random().nextInt(10)+1;
            System.out.println("Números sorteiados: "+sorteio);
            cc=cc+1;
            
            float rest = sorteio%3; 
            boolean resul = rest==0;
            
            if(sorteio>=5){
                acima = acima+1;
            }else if (resul==true){
                div = div+1;
            }
        }
        System.out.println("Numeros acima de 5:"+acima);
        System.out.println("Números divisíveis por 3: "+div);
    }
    
}
