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
public class NumeroPar {
    public static void main(String[] args) {
        Integer pairNumbers = 0;
        
        while (pairNumbers <= 40) {
            System.out.println(pairNumbers);
            pairNumbers = pairNumbers + 2;
        }
    }
}
