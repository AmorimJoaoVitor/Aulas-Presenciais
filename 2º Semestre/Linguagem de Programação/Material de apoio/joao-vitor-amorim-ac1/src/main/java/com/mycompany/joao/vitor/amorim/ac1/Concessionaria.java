/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.joao.vitor.amorim.ac1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author João Vitor de Amorim Bezerra 2ADSA. ENUNCIADO:
 *
 * Na concessionária "Jonh's AutoCars", vai ser lançada uma campanha para
 * aumentar as vendas do mês, a campanha consiste em, caso o cliente compre um
 * carro em um determinado intervalo de preço, ele terá direito a realizar um
 * giro em uma roleta, que caso caia no número do carro ele ganhará um carro 0
 * KM, quanto maior for o preço do carro que ele comprou ele poderá ter mais
 * "giros" na roleta dos carros, assim aumentando as chances de ganhar o prêmio,
 * que seria mais um carro.
 *
 * com isso é esperado que o movimento aumente na concessionária, sendo
 * necessário um app que possa organizar melhor a equipe que trabalha nesta
 * concessionária e também para gerenciar a roleta virtual que será usada para o
 * cliente ganhar os prêmios.
 *
 * Foi pedido para você, desenvolvedor, criar um app para a concessionária, onde
 * possam ser mostrados os acessos de acordo com cada cargo, mas primeiro: Faça
 * um sistema de login para cada um desses cargos e crie uma autenticação de
 * sessão.
 *
 * Dono - Financeiro, Recursos Humanos e estoque, Gerente - Recursos Humanos e
 * estoque Vendedor - estoque.
 *
 * Crie também uma funcionalidade que o vendedor poderá consultar o valor das
 * parcelas de um carro, para facilitar o processo de venda e ajudar o vendedor.
 *
 * O vendedor digitará o preço do veículo e em seguida a quantidade de parcelas.
 *
 * A baixo exiba o valor de cada parcela e a quantidade das parcelas.
 *
 *
 *
 * Sobre a roleta em que o cliente ganhará o prêmio, deverá ter:
 *
 * Uma quantidade de rodadas da roleta baseado no valor da comprar do cliente,
 * exibindo mansagens sendo: Entre R$ 20,000 e R$ 30,000 - 1 rodada, Entre R$
 * 30,000 e R$ 40,000 - 2 rodadas, Mais do que R$ 40,000 - 3 rodadas, Menos do
 * que R$ 20,000 - Exiba a mensagem: "Não tem direito a concorrer ao prêmio"
 *
 * A roleta deve ter 10 "slots" e o cliente deverá escolher em qual desses slots
 * ele irá ganhar o prêmio caso a roleta pare nesse slot em específico, Exemplo:
 *
 * O cliente escolheu o slot '6', dito isso, caso a roleta pare no número '6',
 * ganhará o prêmio.
 *
 * Exiba o número que o cliente escolheu, e logo em seguida "gire" a roleta,
 * Caso tenha parado no número escolhido, Exiba: "Parabéns X , você levou o Y
 * como prêmio de nossa roleta!" sendo "X" O nome do cliente e "Y" o modelo do
 * carro prêmio.
 *
 * Caso não a roleta não pare no número escolhido e caso restam tentativas,
 * exiba: "Não foi dessa vez, mas você ainda tem "T" tentativa(s)", Sendo "T" o
 * número restante de tentativas e reduza o número de tentativas.
 *
 * Caso o cliente não tenha mais tentativas, Exiba: "Suas tentativas acabaram..
 * " e finalize.
 *
 *
 *
 *
 *
 */
public class Concessionaria {

    public static void mostrarAcessos(String user) {
        System.out.println("-------------------------------");
        switch (user) {
            case "dono":
                System.out.print("Financeiro, ");
            case "gerente":
                System.out.print("Recursos Humanos e ");
            case "vendedor":
                System.out.println("estoque.");
                System.out.println("-------------------------------");
                break;
        }
    }

    public static Boolean verificadorDeLogin(String user, String password, String contribuitorName) {
        Boolean sessionStarted = false;

        do {
            if ("dono".equals(user) && "donodetudo".equals(password)) {
                System.out.println(String.format("Olá %s, você entrou com o perfil de dono", contribuitorName));
                sessionStarted = true;
            } else if ("gerente".equals(user) && "bosschegou".equals(password)) {
                System.out.println(String.format("Olá %s, você entrou com o perfil de gerente", contribuitorName));
                sessionStarted = true;
            } else if ("vendedor".equals(user) && "partiubatermeta".equals(password)) {
                System.out.println(String.format("Olá %s, você entrou com o perfil de vendedor", contribuitorName));
                sessionStarted = true;
            } else {
                System.out.println("Login inválido, por favor digite um login válido");
                break;

            }
        } while (!sessionStarted);
        return sessionStarted;
    }

    public static Double valorParcela(Double carPrice, Integer quantidadeParcelas) {
        Double valorParcela;
        valorParcela = carPrice / quantidadeParcelas;
        return valorParcela;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String contribuitorName, user, password, customerName, carNameForDraw, option, enter;
        Integer quantidadeParcelas, attemps = 0, drawNumberCar, rouletteDrawNumber;
        Double carPrice;
        Boolean sessionStarted = false, validAttemps = true;

        System.out.println("-------PÁGINA DE LOGIN--------");

        System.out.println("Seu nome");
        contribuitorName = input.nextLine();

        do {
            System.out.println("Nome de usuário");
            user = input.nextLine();

            System.out.println("Senha");
            password = input.nextLine();

        } while (!verificadorDeLogin(user, password, contribuitorName));
        sessionStarted = true;
        do {
            if (sessionStarted) {
                System.out.println(String.format("digite roleta para inciar a roleta "
                        + "\ndigite acessos para ver seus acessos"
                        + "\nDigite parcelas para consultar as parcelas do carro"));
                option = input.nextLine();

                if ("acessos".equals(option)) {
                    mostrarAcessos(user);

                } else if ("parcelas".equals(option)) {

                    System.out.println("Ok! Primeiro informe o preço do carro:");
                    carPrice = input.nextDouble();
                    System.out.println("Agora a quantidade de parcelas desejadas");
                    quantidadeParcelas = input.nextInt();

                    System.out.println("----Calculando parcelas aguarde ...");

                    System.out.println(String.format("As parcelas vão sair por %dX de R$ %.2f",
                            quantidadeParcelas, valorParcela(carPrice, quantidadeParcelas)));
                    
                    sessionStarted = false;

                    //sessionStarted = false;
                } else if ("roleta".equals(option)) {
                    System.out.println("Ok! primeiro cadastre o nome do cliente");
                    customerName = input.nextLine();

                    System.out.println(String.format("Cliente cadastrado: %s", customerName));

                    System.out.println("Modelo do carro prêmio");
                    carNameForDraw = input.nextLine();

                    System.out.println("Valor da compra do cliente");
                    carPrice = input.nextDouble();

                    if (carPrice < 20.000) {
                        System.out.println("Não terá direito a nenhuma rodada na roleta!");
                        sessionStarted = false;
                    } else if (carPrice >= 20.000 && carPrice < 30.000) {
                        System.out.println("terá direito a uma tentativa");
                        attemps = 1;
                    } else if (carPrice > 30.000 && carPrice < 40.000) {
                        System.out.println("Terá direito a duas tentativas");
                        attemps = 2;
                    } else {
                        System.out.println("Terá direito a três tentativas");
                        attemps = 3;
                    }

                    do {

                        System.out.println("Escolha o slot de 1 a 10 da roleta onde você será o ganhador!");
                        drawNumberCar = input.nextInt();
                        attemps--;

                        rouletteDrawNumber = ThreadLocalRandom.current().nextInt(1, 10);
                        System.out.println("Seu número é: " + drawNumberCar);

                        System.out.println("E a roleta parou no númeroo .. : " + rouletteDrawNumber);

                        if (drawNumberCar == rouletteDrawNumber) {

                            System.out.println(String.format("Parabéns %s , você levou o %s como prêmio de"
                                    + " nossa roleta!", customerName, carNameForDraw));
                            validAttemps = false;

                        } else {
                            if (attemps != 0) {

                                System.out.println(String.format("Não foi dessa vez, mas você ainda tem %d tentativa(s)", attemps));
                            } else {
                                System.out.println("Suas tentativas acabaram e você não ganhou nada.. ");
                                validAttemps = false;
                            }
                        }
                    } while (validAttemps);

                    System.out.println("\n-------Finalizando roleta virtual-------");
                    sessionStarted = false;
                }
            }
        } while (sessionStarted);
    }
}
