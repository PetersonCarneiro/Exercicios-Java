/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer43;

/**
 *
 * @author peter
 */
public class Exer43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 30;
        
        while(cc>=2){
            
            cc=cc-1;
            
            int resto = cc%4;
            boolean resul = resto==0;
                    
            if(resul==true){
                System.out.println("["+cc+"]");
            }else{
                System.out.println(cc);
            }
        }
    }
}
