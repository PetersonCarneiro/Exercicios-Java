/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer22;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        Date ano1 = new Date();
        SimpleDateFormat formate = new SimpleDateFormat("y");
        String ano2 = formate.format(ano1);
        int ano3 = Integer.parseInt(ano2);
        
        System.out.println("Qual é o seu ano de nascimento: ");
        int anoNasc = teclado.nextInt();
        
        int resul = ano3-anoNasc;
        
        if(resul == 18){
            System.out.println("Você deve se listar ");
        }else if(resul<18){
            int antes = 18-resul;
            System.out.println("Você ainda não tem idade suficiente para se alistar, falta "+antes+" anos");
        }else if(resul>18){
            int depois = resul-18;
            System.out.println("Já passaram "+depois+" anos para vc ter se alistado");
        }
        
    }
    
}
