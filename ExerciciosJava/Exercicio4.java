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
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Cálculo da área de um triângulo
        
        float area_t;
        float base;
        float altura_t;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da BASE do triângulo: ");
        base = teclado.nextFloat();
        
        System.out.println("Digite o valor da ALTURA do triângulo: ");
        altura_t = teclado.nextFloat();
        
        area_t = (base * altura_t) / 2;
        
        System.out.printf("O valor da área do triângulo é: %.2f", area_t);
        System.out.println();
        
        //Cálculo da área de um quadrado
        
        float lado;
        float area_q;
        
        System.out.println("Digite o valor do lado do quadrado: ");
        lado = teclado.nextFloat();
        
        area_q = (float) Math.pow(lado, 2);
        
        System.out.printf("O valor da área do quadrado é: %.2f", area_q);        
         System.out.println("");
        
        //Cálculo de IMC (Índice de Massa Corporal)
        
        float peso;
        float altura;
        float imc;
        
        System.out.println("Digite o seu peso(kg): ");
        peso = teclado.nextFloat();
        
        System.out.println("Digite a sua altura(m): ");
        altura = teclado.nextFloat();
        
        altura = (float) Math.pow(altura, 2);
        imc = (peso) / (altura);
        
        System.out.printf("O seu IMC é de: %.2f", imc);
    }
    
         
}
