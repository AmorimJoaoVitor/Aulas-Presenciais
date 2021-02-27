/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exibe.media;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class LeExibeMedia {

        public static void LeExibeMediaMedia() {
        Scanner input = new Scanner (System.in);
        
        Integer media, qtdnumeros, numero, repete = 0, soma = 0;
        
            System.out.println("Digite quantas vezes irá repetir");
            qtdnumeros = input.nextInt();
            
            do {                
                
                System.out.println("Digite um número maior que 0");
                numero = input.nextInt();
                soma += numero;
                repete++;
                        
            } while (repete < qtdnumeros);
            media = soma / repete;
            System.out.println("A média dos números lidos é igual a " +media);
    }
        public static void main(String[] args) {
        LeExibeMediaMedia();
    }
}
