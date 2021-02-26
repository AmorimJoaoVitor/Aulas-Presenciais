/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.java;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Admin
 */
public class Sorteio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer impares = 0;
        Integer pares = 0;
        Integer primeiroSorteio = 0;
        System.out.println("Solicite um numero de 0 a 100:");
        Integer numero = in.nextInt();

        for(Integer i = 1; i < 200; i = i + 1) {
            Integer numSorteio = ThreadLocalRandom.current().nextInt(0, 100);
            if (numSorteio == numero && primeiroSorteio == 0) {
                primeiroSorteio = i;
            }

            if (i % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
        }

        System.out.println("O Numero " + numero + ", caiu no sorteio " + primeiroSorteio);
        System.out.println("Total de numeros Pares: " + pares);
        System.out.println("Total de numeros Impares: " + impares);
    }
}
    
