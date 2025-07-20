/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class VinteQuatro {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        char continuar = 'S'; // Começa assumindo que o usuário quer continuar

        while (continuar == 'S' || continuar == 's') {
            System.out.println("Digite um número: ");
            float numero = leitor.nextFloat();

            if (numero == 0) {
                System.out.println("O número é Zero!");
            } else if (numero > 0) {
                System.out.println("O número é Positivo!");
            } else {
                System.out.println("O número é Negativo!");
            }

            System.out.println("Deseja continuar? (S) Sim / (N) Não");
            continuar = leitor.next().charAt(0); // Lê a primeira letra da resposta
        }

        System.out.println("Programa finalizado.");
    }
}

