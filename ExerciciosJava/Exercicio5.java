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
public class Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Conversão de Km para Milhas
        
        int km;
        float milhas;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantidade de km: ");
        km = teclado.nextInt();
        
        milhas = (float) (km / 1.60934);
        
        System.out.printf(km + "km em milhas vale: %.2f", milhas);
    }
    
}
