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
public class NumeroImpar {
    public static void main(String[] args) {
        Integer impar = 1;
        
        for (Integer count = 1; count <= 45 ; count++) {
            System.out.println(impar);
            impar = impar + 2;
        }
    }
}
