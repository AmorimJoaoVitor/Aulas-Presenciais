/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.meu.projeto;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class PrimeiroPrograma {
    public static void main(String[] args) {
        System.out.println ("Boa \n noite");
        System.out.println("Bem vindo \t à turma");
        // print - serve para exibir a mensagem e continua na mesma linha
        // println - serve para exibir a mensagem e já muda para a prox linha
        
        System.out.println("Como vai " + args[0] + "?");
        
        // declarando uma variavel tipo texto
        String nome;
        nome = "Igo"; // atribuição - String é sempre delimitado por aspas duplas
        
        System.out.println("O nome dele é " + nome);
        
        // Ler dados do teclado
        Scanner leitor = new Scanner(System.in);
        
        // Solicitar que o usuário digite o nome
        System.out.println("Digite seu nome");
        nome = leitor.next(); // next() é o metodo utilizado para ler uma palavra
        System.out.println("Bem vindo " + nome);
        
        
        
    }
}
