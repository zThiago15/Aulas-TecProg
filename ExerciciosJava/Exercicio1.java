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
public class Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Seja bem-vindo!
        
        String nome;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Olá! Digite o seu nome: ");
        nome = teclado.next();
        System.out.println("Olá "+nome+"! Seja bem vindo!");
        
        
    }
    
}
