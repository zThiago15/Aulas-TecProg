/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author Thiago Dias
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Tabuada
        
        int numero;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para fazer sua tabuada: ");
        numero = teclado.nextInt();
        
        for (int i = 1; i < 11; i++) {
            System.out.println(numero+ " x " + i + " = " +(numero * i));
            
        }
        
    }
    
}
