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
public class Login {
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
        
        String user, password;
        
        
        do {

        System.out.println("Digite seu usuário:");
        user = reader.nextLine();
        
        System.out.println("Digite sua senha:");
        password = reader.nextLine();
        
        if ("admin".equals(user) && "#Bandtec".equals(password)) {
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Login e/ou senha inválidos");
        }
            
        } while (!"admin".equals(user) || !"#Bandtec".equals(password));
        
    }
}
