/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segunda.aula;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SegundaAulaJava {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       
       //Criação da variável double
       Double nota1, nota2, divisao, media;
       
       //Criação de variáveis inteiras
       Integer num1, num2, num3, resultado;
       // Criação do objeto leitor da classe Scanner
       
        Scanner leitorNL = new Scanner(System.in);
        
     
       
       //Criação de variáveis String(Textto)
       
       String snum1, snum2, nome;
       
       // Criação de variável boolena (TRUE OR FALSE)
       
       Boolean aprovado;
       
       // Divisão de números inteiros
       num1 = 9;
       num2 = 2;
       // Para fazer a divisão com casas decimais, precisa converter um dos 
       // valores (num1) OU (num2) para double antes da divisão 
       divisao = Double.valueOf(num1) / num2;
        System.out.println("O resultado é = " + divisao);
        
        // para que um número seja considerado double, adicionar um ".0" como no 
        // exemplo a seguir
        divisao = 1.0 / 2;
        System.out.println("Divisão: " + divisao);
        
        //Leitura de valor real
        
        System.out.println("Digite sau nota1");
        nota1 = leitor.nextDouble();
        System.out.println("Digite sua nots2");
        nota2 = leitor.nextDouble();
        
        /* Calculo da média */
        
        media = (nota1 + nota2) / 2;
        System.out.println("Sua média é " + media);
        
        // Interpolação
        // String.format("texto" + var1, var2, etc)
        //No lugar do texto, uso formatos para definir como deve ser  
        // exibido o valor da variável
        // %f - para exibir números reais (com casas decimais)
        // %d - para exibir números inteiros
        // %s - para exibir texto (String)
        //%.2f - para exibir números reais com 2 casas decimais
        // %.1f - para exibir números reais com uma casa decimal
        
        System.out.println(String.format("A media é %.2f", media));
        System.out.println(String.format("Nota1: %.2f \n Nota2: %.2f \n Média: %.1f",
                                                    nota1, nota2, media));
        
        // Criação de String para integer
        
        snum1 = "10";
        
        // Caracter '1' corresponde em código ASC ao valor 31H, 31H é 00110001 
        // em binário
        // O número 1 é 000000001 em binário
        
        num1 = Integer.valueOf(snum1);
        resultado = num1 + num2;
        
        System.out.println("Resultado = " + resultado);
        
        //Conversão String para Double
        snum2 = "7.5";
        nota1 = Double.valueOf(num2);
        media = (nota1 + nota2) / 2;
        
        System.out.println("Sua média é = " + media);
        
        // IF sem ELSE
        
        if(media >= 6){
            System.out.println("Aprovado");
        }
        
        if (media >= 6) {
            aprovado = true;
        }
        else {
            aprovado = false;
        }
        
        // Comparando a variável booleana
        
        if(aprovado){
            System.out.println("Você pode cursar o 3 semestre");
        }
        else {
            System.out.println("Tente novamente");
        }
        
         
        
        // Quando pedimos para o usuário digitar um valor que não é texto ou qdo usa o next()
        // e em seguida usamos o nextLine() para ler um texto
        System.out.println("Digite um número inteiro");
        num1 = leitor.nextInt();
        
        System.out.println("Digite seu nome");
        nome = leitorNL.nextLine();
        
        System.out.println("Digite outro número inteiro");
        num2 = leitor.nextInt();
        
        System.out.println("Digite 3 números");
        num1 = leitor.nextInt();
        num2 = leitor.nextInt();
        num3 = leitor.nextInt();
        
        System.out.println(String.format("num1= %d\nnum2= %d\nnum3= %d",
                           num1, num2, num3));
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
