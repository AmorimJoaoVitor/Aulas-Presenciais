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
public class Loteria {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        Integer numeroUsuario, numSorteio, tentativas = 0;
        
        
      do {
          numSorteio = ThreadLocalRandom.current().nextInt(0,10);
          
          System.out.println("Digite um número entre 0 e 10");
          numeroUsuario = input.nextInt();
          tentativas++;
          
          System.out.println(numSorteio);
          
          if(numSorteio == numeroUsuario){
              if (tentativas <= 3) {
                    System.out.println("Você é MUITO sortudo");
                } else if (tentativas <= 10) {
                    System.out.println("Você é sortudo");
                } else {
                    System.out.println("É melhor você parar de apostar e ir trabalhar");
                    tentativas = 0;
                }
               
            } else {
                System.out.println("Você errou, tente novamente");
          
          }
          
      }while(numeroUsuario >= 0 && numeroUsuario <= 10);
     
    }
}
