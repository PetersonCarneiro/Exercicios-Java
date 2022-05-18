/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer58;

import java.util.Scanner;

/**
 *
 * @author peter
 */
public class Exer58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        
        float media=0;
        int cont=0;
        while (true){
            System.out.println("Qual a idade do aluno: ");
            int idade = tc.nextInt();
            if(idade==999){
                break;
            }else{
                cont+=1;
                media=(media+idade)/cont;
            }
        }
        System.out.println("A quantidade de alunos é: "+cont);
        System.out.println("A media de idade da turma é: "+media);
    }
    
}
