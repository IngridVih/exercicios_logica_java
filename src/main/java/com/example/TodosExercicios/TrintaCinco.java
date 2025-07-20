/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class TrintaCinco {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tipo de cliente: (R) Residência, (C) Comércio, (I) Indústria");
        char tipoCliente = leitor.next().toUpperCase().charAt(0);

        System.out.println("Digite a quantidade de KW/h consumida: ");
        float consumo = leitor.nextFloat();

        float valorKw = 0.0f;
        float valorTotal = 0.0f;

        switch (tipoCliente) {
            case 'R':
                valorKw = 0.60f;
                break;
            case 'C':
                valorKw = 0.48f;
                break;
            case 'I':
                valorKw = 1.29f;
                break;
            default:
                System.out.println("Tipo de cliente inválido.");
                leitor.close();
                return;
        }

        valorTotal = valorKw * consumo;

        System.out.println("O valor da conta de luz é: R$ " + valorTotal);

    }
}
