/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer30;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("lado A:");
        int a = teclado.nextInt();
        System.out.println("lado B:");
        int b = teclado.nextInt();
        System.out.println("lado C:");
        int c = teclado.nextInt();
        
        boolean resul = ((a+b>c)&&(a+c>b)&&(b+c>a));
        
        
        
        if(resul == true){
            System.out.println("É um triângulo");
            boolean equi = (a==b)&&(b==c)&&(a==c);
            boolean esc = (a!=b)&&(b!=c)&&(a!=c);
            boolean iso = (a==b)!=(b==c)!=(a==c);
            
            if(equi == true){
                System.out.println("Equiltero");
            }else 
                if ( iso == true){
                System.out.println("Isóceles");
            }else 
                if (esc == true){
                System.out.println("Escaleno");
            }
                
        }else 
            if(resul == false){
            System.out.println("Não é um triângulo!");
        }
        
        
    }
    
}
