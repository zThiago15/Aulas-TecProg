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
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Média aritmética de Matemática
        
        String nome;
        float nota1, nota2, nota3, nota4, media;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Olá aluno(a), digite o seu nome: ");
        nome = teclado.next();
        
        System.out.println("Digite a 1ª nota: ");
        nota1 = teclado.nextFloat();
        
        System.out.println("Digita a 2ª nota: ");
        nota2 = teclado.nextFloat();
        
        System.out.println("Digite a 3ª nota: ");
        nota3 = teclado.nextFloat();
        
        System.out.println("Digita a 4ª nota: ");
        nota4 = teclado.nextFloat();
                
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.printf("A média de Matemática do(a) aluno(a) "+nome+" é: %.1f", media);
        
    }
    
}
