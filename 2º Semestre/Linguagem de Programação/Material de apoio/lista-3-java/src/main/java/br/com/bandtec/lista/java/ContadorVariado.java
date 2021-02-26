/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.lista.java;

/**
 *
 * @author Admin
 */
public class ContadorVariado {
    public static void main(String[] args) {
        for (Double count = 0.15; count < 5; count = count + 0.15) {
            System.out.println(String.format("Valor: %.2f", count));
        }
    }
}
