/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3.java;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author CYOT7
 */
public class ExemploEstruturaRepeticao {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Integer num, numAleatorio;
        Double numRealAleatorio;
        
        // Basicamente existem 3 estruturas de repetição
        // for, while, do while
        
        // Exemplo de uso de for
        // Exibir os números de 1 a 7
        System.out.println("Exibindo de 1 a 7 usando for");
        for (Integer i = 1; i <= 7; i++) {
            System.out.println(String.format("Contador= %d", i));
        }
        
        // Mesmo exemplo usando while
        System.out.println("\nExibindo de 1 a 7 usando while");
        Integer cont = 1;
        while (cont <= 7) {
            System.out.println(String.format("Contador= %d", cont));
            cont++;
        }

        // Exibir os números de 7 a 1
        System.out.println("\nExibindo de 7 a 1 usando for");
        for (Integer i = 7; i >= 1; i--) {
            System.out.println(String.format("Contador= %d", i));
        }
        
        // Mesmo exemplo usando while
        System.out.println("\nExibindo de 7 a 1 usando while");
        cont = 7;
        while (cont >= 1) {
            System.out.println(String.format("Contador= %d", cont));
            cont--;
        }

        // Exibindo de 1 a 7 usando do while
        System.out.println("\nExibindo de 1 a 7 usando do while");
        cont = 1;
        do {
            System.out.println(String.format("Contador= %d", cont));
            cont++;
        } while (cont <= 7);
        
        // O do while compara após realizar uma vez o trecho do loop
        // É semelhante ao while, mas ele sempre executa pelo menos uma vez
        // o trecho do loop, pq compara a condição após executar o loop.
        
        // É útil por exemplo qdo vc quer validar o valor de um
        // número digitado pelo usuário
        // Por exemplo, solicitar que o usuário digite um número
        // que deve ser maior do que zero
        // Enquanto for menor ou igual a zero, deve solicitar novamente
        
        do {
            System.out.println("Digite um número maior do que zero");
            num = leitor.nextInt();
        } while (num <= 0);
        
        // Geração de número aleatório
        // Existem várias formas de se gerar numero aleatório
        // Mas a que vamos ver é a mais prática, sendo possível
        // especificar um intervalo
        
        // vamos gerar um número aleatório inteiro
        // vamos supor que estamos simulando o jogo de um dado
        // o exemplo a seguir gera número aleatório entre 1 e 6
        numAleatorio = ThreadLocalRandom.current().nextInt(1,6);
        System.out.println("Número gerado: " + numAleatorio);
        
        // o mesmo vale para número aleatório do tipo Double
        // o exemplo a seguir gera número aleatório real
        // entre 0 e 10
        numRealAleatorio = ThreadLocalRandom.current().nextDouble(0,10);
        System.out.println("Número gerado: " + numRealAleatorio);
    }
    
}
