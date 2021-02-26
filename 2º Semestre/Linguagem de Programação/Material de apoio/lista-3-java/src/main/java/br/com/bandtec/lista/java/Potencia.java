/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.java;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Potencia {
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
        
        Integer potencia, expoente, result = 0;
        
        System.out.println("Digite uma potência:");
        potencia = reader.nextInt();
        
        System.out.println("Digite um expoente:");
        expoente = reader.nextInt();
        
        result = potencia * potencia;
        for (Integer count = 2; count < expoente; count++) {
            result = (result * potencia);
        }
        
        System.out.println(result);
        
    }
}
