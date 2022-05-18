/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer31;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();
        //U(1)- C(2) = -1, vencedor Usuario*
        //U(1)- C(3) = -2, vencedor Computador* 
        //U(2)- C(1) = 1, vencedor Computador*
        //U(2)- C(3) = -1, vencedor Usuario*
        //U(3)- C(1) = 2, vencedor Usuario*
        //U(3)- C(3) = 1, vencedor Computador*
        
        
        int nComp = gerador.nextInt(3)+1;
        
        System.out.println("Escolha uma opção(Pedra(1)(Papel(2)(Tesoura(3): ");
        int nUsua = teclado.nextInt();
        
        switch(nComp){
            case 1:
                System.out.println("Computador escolheu Pepel");
                break;
            case 2:
                System.out.println("Computador escolheu Pedra");
                break;
            case 3:
                System.out.println("Compuatdor escolheu Tesoura");
                break;   
        }
       
        if(nUsua==nComp){
            System.out.println("Empate");
        }else if ((nUsua-nComp==-1)||(nUsua-nComp==2)){
            System.out.println("Usuario Vencedor");
        }else if ((nUsua- nComp==-2)|| (nUsua - nComp == 1)){
            System.out.println("Computador Vencedor");
        }
       
      
    }
    
}
