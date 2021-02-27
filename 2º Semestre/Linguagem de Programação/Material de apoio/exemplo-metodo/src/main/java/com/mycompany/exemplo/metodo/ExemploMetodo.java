/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exemplo.metodo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ExemploMetodo {

    public static void exibeAsterisco() {
        System.out.println("*******************************************");
    }

    public static void exibirQuadro() {
        exibeAsterisco();
        System.out.println("******                              *****");
        exibeAsterisco();
    }

    public static void exibirQuadro(String frase) {
        exibeAsterisco();
        System.out.println("******            Boa noite                  *****");
        exibeAsterisco();
    }

    public static void main(String[] args) {
        exibeAsterisco(); // Chamada do método
        Scanner leitor = new Scanner(System.in);
        Integer num1, num2, resultado, soma;
        System.out.println("");
        exibeAsterisco();
        exibirQuadro();
        exibirQuadro("Boa noite");
        Double n1, n2, n3;

        System.out.println("Digite o primeiro número");
        num1 = leitor.nextInt();

        System.out.println("Digite o segundo número");
        num2 = leitor.nextInt();

        resultado = soma(num1, num2);

        resultado = maior(num1, num2);
       

        System.out.println("Digite a nota 1");
        n1 = leitor.nextDouble();
        System.out.println("Digite a nota 2");
        n2 = leitor.nextDouble();
        System.out.println("Digite a nota 3");
        n3 = leitor.nextDouble();
        
        media(n1, n2, n3);
        
        System.out.println(String.format("Sua média é %.2f", media(n1, n2, n3)));
        
        System.out.println("Digite a nota 1");
        n1 = leitor.nextDouble();
        System.out.println("Digite a nota 2");
        n2 = leitor.nextDouble();
       
        
        media(n1, n2);
        
        System.out.println(String.format("Sua média é %.2f", media(n1, n2)));
        

    }

    public static Integer soma(Integer a, Integer b) {
        return a + b;
    }

    public static Integer soma1(Integer a, Integer b) {
        Integer resultado;
        resultado = a + b;
        return resultado;
    }
    // metodo maior - recebe dois valores inteiros e retorna o maior deles

    public static Integer maior(Integer x, Integer y) {
        if (x >= y) {
            return x;

        } else {
            return y;
        }
    }

    // me´todo me´dia que recebe dois valores double e retoena a média 
    // que também é Double
    public static Double media(Double n1, Double n2, Double n3) {
        Double resultado;
        resultado = (n1 + n2 + n3) / 3;
        return resultado;
    }
     public static Double media(Double n1, Double n2) {
        Double resultado;
        resultado = (n1 + n2 ) / 2;
        return resultado;
    }
}
