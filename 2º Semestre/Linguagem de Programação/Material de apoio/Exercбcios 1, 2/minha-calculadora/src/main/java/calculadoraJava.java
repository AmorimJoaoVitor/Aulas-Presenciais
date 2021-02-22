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
public class calculadoraJava {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        Integer n1, n2;
        n1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        n2 = input.nextInt();
        
        Integer soma = n1 + n2;
        Integer subtracao = n1 - n2;
        Integer multiplicacao = n1 * n2;
        Integer divisao = n1 / n2;
        
        System.out.println("Resultado de " + n1 + "+" + n2 + " é " + soma );
        System.out.println("Resultado de " + n1 + "-" + n2 + " é " + subtracao );
        System.out.println("Resultado de " + n1 + "*" + n2 + " é " + multiplicacao );
        System.out.println("Resultado de " + n1 + "%" + n2 + " é " + divisao );
    }
}
