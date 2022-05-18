/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer35;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Qual modelo de carro[Popular(1)] ou [Importado(2)]: ");
        int carro = teclado.nextInt();
        
        System.out.println("Quanto dias de aluguel: ");
        int dias = teclado.nextInt();
        
        System.out.println("Quantos km percorridos: ");
        int km = teclado.nextInt();
        
        if(carro == 1){
            float pop = 90*dias;
            if(km<=100){
                double aluguelPop = (km*0.20)+pop;
                System.out.println("O valor do aluguel é: "+aluguelPop);
            }else if(km>100){
                double aluguelPop = (km*0.20)+pop;
                System.out.println("O valor do aluguel é: "+aluguelPop);
            }
        }else if( carro == 2 ){
            float luxo = 150*dias;
            if(km<=200){
                double alugueLuxo = luxo+(0.30*km);
                System.out.println("O valor do aluguel é: "+alugueLuxo);
            }else if(km>100){
                double alugueLuxo = luxo+(0.25*km);
                System.out.println("O valor do aluguel é: "+alugueLuxo);
            }
        }
    }
}
