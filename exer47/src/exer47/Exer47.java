/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer47;

/**
 *
 * @author peter
 */
public class Exer47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc=500;
        int resul=0;
        while (cc>=0){
            System.out.println(cc+"+");
            cc=cc-50;
            resul=cc+resul;
        }
        System.out.println("Resultado: "+resul);
    }
    
}
