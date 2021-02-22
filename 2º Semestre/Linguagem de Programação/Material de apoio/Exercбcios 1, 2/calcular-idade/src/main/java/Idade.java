/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Idade {
    public static void main(String[] args) {
        
        Integer ano;
        String nome;
        Scanner input = new Scanner (System.in);
        
        System.out.println("Digite seu nome");
        nome = input.nextLine();
        
        System.out.println("Olá " + nome + "! Qual seu ano de nascimento?");
        ano = input.nextInt();
        
        Integer idade = 2021 - ano + 9;
        System.out.println("Em 2030 você terá " + idade + " anos");
              
    }
}
