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
public class Exercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Conversão de meses para dias
        
        int meses;
        int dias;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Quantidade de meses: ");
        meses = teclado.nextInt();
        
        dias = meses * 30;
        
        System.out.println("Em " +meses+ " meses há " +dias+ " dias;");
    }
    
}
