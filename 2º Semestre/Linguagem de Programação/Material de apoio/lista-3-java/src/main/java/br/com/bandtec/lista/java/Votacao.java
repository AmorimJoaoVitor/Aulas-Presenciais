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
public class Votacao {
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
        
        Integer voting, calabresa = 0, mussarela = 0, queijos = 0;
        
        for (Integer count = 1; count <= 10; count++) {
            System.out.println("Vote no sabor de pizza favorita por você, vote 5 para mussarela, 25 para calabresa e 50 para 4 queijos:");
            voting = reader.nextInt();
            
            if (voting == 5) {
                mussarela++;
            } else if (voting == 25) {
                calabresa++;
            } else if (voting == 50) {
                queijos++;
            } else {
                System.out.println("Por favor, dê um voto válido");
                count--;
            }
        }
        
        System.out.println("Votos:\nMussarela: " + mussarela + "\nCalabresa: " + calabresa + "\n4 Queijos: "+ queijos);
        if (mussarela > calabresa && mussarela > queijos) {
            System.out.println("\nMussarela é o vencedor na pesquisa");
        } else if (calabresa > mussarela && calabresa > queijos) {
            System.out.println("\nCalabresa é o vencedor na pesquisa");
        } else if (queijos > mussarela && queijos > calabresa) {
            System.out.println("\n4 queijos é o vencedor na pesquisa");
        } else {
            System.out.println("Teve empate");
        }
    }
}
