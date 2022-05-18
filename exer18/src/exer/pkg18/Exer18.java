/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer.pkg18;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("y");
        
        String dataf = formatar.format(data);
        int year = Integer.parseInt(dataf);
        
        System.out.println("Qual o seu ano de nascimento: ");
        int ano = teclado.nextInt();
        
        int resul = year-ano;
        
        if(resul > 18){
            System.out.println("Você tem "+resul+" anos pode votar!");
        }else
            System.out.println("Você tem "+resul+" anos não pode votar!");
        
    }
    
}
