/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer70;

/**
 *
 * @author peter
 */
public class Exer70 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int f1=0;
        int f2=1;
        for(int cc=0; cc<=10;cc++){
            System.out.println(f1);
            int aux=f1;
            f1=f1+f2;
            f2=aux;
        }
    }
}
