/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer46;

/**
 *
 * @author peter
 */
public class Exer46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 6;
        int resul =0;
        while (cc<=100){
            System.out.println(cc+"+");
            cc=cc+2;
            resul = cc+resul;       
        }        
        System.out.println("Resultado:"+resul);  
    }
}
