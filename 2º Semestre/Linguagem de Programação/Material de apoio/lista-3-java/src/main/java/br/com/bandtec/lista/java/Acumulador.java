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
public class Acumulador {
    public static void main(String[] args) {
          Scanner reader = new Scanner(System.in);
        
        Integer number, currentNumber = 0;
        do {
            System.out.println("Digite um número, quando digitar o numero 0, fará as somas doa anteriores");
            number = reader.nextInt();
            currentNumber = currentNumber + number;
        } while (number != 0);
        System.out.println("O valor final foi: " +currentNumber);
    }
}
