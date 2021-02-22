/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lista.dois;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Elevador {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Double  pesoTotal, limitePeso, peso1, peso2, peso3;
        Integer limitePessoas;
        
        System.out.println("Digite o limite de peso");
        limitePeso = leitor.nextDouble();
        System.out.println("Digite o limite de pessoas");
        limitePessoas = leitor.nextInt();
        
        System.out.println("Digite o peso da 1 pessoa");
        peso1 = leitor.nextDouble();
        System.out.println("Digite o peso da 2 pessoa");
        peso2 = leitor.nextDouble();
        System.out.println("Digite o peso da 3 pessoa");
        peso3 = leitor.nextDouble();
        
        pesoTotal = peso1 + peso2 + peso3;
        
        
        System.out.println("O peso total no elevador é de " + pesoTotal + " KG sendo que ele suporta " + limitePeso " KG");
        
        
        
        System.out.println("Entraram 3 pessoas no elevador no qual cabem " + limitePessoas + "pessoas");
        System.out.println("");
    }
}
