/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula3.java;

import java.util.Scanner;

/**
 *
 * @author CYOT7
 */
public class ExemploSwitchCase {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Integer diaDaSemana, posicao;
        
        // O usuário digitará o dia da semana (inteiro de 1 a 7)
        // O programa exibirá qual o dia da semana correspondente
        // Se for o dia 1, exibirá "Domingo"
        // Se for o dia 2, exibirá "Segunda-feira"
        // e assim por diante
        
        System.out.println("Digite o dia da semana (1 a 7)");
        diaDaSemana = leitor.nextInt();
        
        // Lógica usando if else
        if (diaDaSemana == 1) {
            System.out.println("Domingo");
        }
        else if (diaDaSemana == 2) {
            System.out.println("Segunda-feira");
        }
        else if (diaDaSemana == 3) {
            System.out.println("Terça-feira");
        }  // e assim por diante
        
        // Mesma lógica usando switch case
        switch (diaDaSemana) {
            case 1: // diaDaSemana é igual a 1
                System.out.println("Domingo");
                break;
                
            case 2: // diaDaSemana é igual a 2
                System.out.println("Segunda-feira");
                break;
                
            case 3: // diaDaSemana é igual a 3
                System.out.println("Terça-feira");
                break;
                
            case 4: // diaDaSemana é igual a 4
                System.out.println("Quarta-feira");
                break;
                
            case 5: // diaDaSemana é igual a 5
                System.out.println("Quinta-feira");
                break;
                
            case 6: // diaDaSemana é igual a 6
                System.out.println("Sextou");
                break;
                
            case 7: // diaDaSemana é igual a 1
                System.out.println("Sábado");
                break;
                
            default: // diaDaSemana não é nenhum dos anteriores
                     // diaDaSemana é diferente de 1 a 7
                System.out.println("Dia da semana inválido!");
                break;
        }
        
        // Concurso - 1o lugar ganha um iPhone, um iPad, e um iPod
        // 2o lugar ganha um iPad e um iPod
        // 3o lugar ganha apenas um iPod
        System.out.println("Qual a sua posição no concurso?");
        posicao = leitor.nextInt();
        System.out.print("Você ganhou ");
        
        switch (posicao) {
            case 1:
                System.out.print("um iPhone,");
            case 2:
                System.out.print("um iPad e ");
            case 3:
                System.out.println("um iPod.");
                break;
            default:
                System.out.println("experiência! Mais sorte na próxima!");
                break;
        }
        
    }
    
}
