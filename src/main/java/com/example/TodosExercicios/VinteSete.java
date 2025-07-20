/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class VinteSete {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        float totalDesconto = 0.0f;
        float totalPago = 0.0f;

        while (true) {
            System.out.println("Digite o valor do veículo (Digite 0 para encerrar): ");
            float valorVeiculo = leitor.nextFloat();

            if (valorVeiculo == 0) {
                break;
            }

            System.out.println("Digite o tipo de combustível (A - Álcool | G - Gasolina | D - Diesel): ");
            char combustivel = leitor.next().toUpperCase().charAt(0);

            float desconto = 0.0f;

            switch (combustivel) {
                case 'A':
                    desconto = valorVeiculo * 0.25f;
                    break;
                case 'G':
                    desconto = valorVeiculo * 0.21f;
                    break;
                case 'D':
                    desconto = valorVeiculo * 0.14f;
                    break;
                default:
                    System.out.println("Tipo de combustível inválido.");
                    continue; // volta para o início do laço sem contabilizar
            }

            float valorFinal = valorVeiculo - desconto;

            totalDesconto += desconto;
            totalPago += valorFinal;

            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor a ser pago: R$" + valorFinal);
            System.out.println("-----------------------------------------");
        }

        System.out.println("Total de descontos concedidos: R$" + totalDesconto);
        System.out.println("Total pago pelos clientes: R$" + totalPago);
    }
}
