/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.java;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Tabuada {
    public static void main(String[] args) {
        Integer numeroInputQuociente,numeroInputTabuada;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite um número");
        numeroInputTabuada = input.nextInt();
        
        for (int i = 0; i <= 10; i++) {
            numeroInputQuociente = i * numeroInputTabuada;
            System.out.println(String.format("%d x %d = %d", i, numeroInputTabuada, numeroInputQuociente));
        }
            
        }
    }

