/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class VinteOito {
    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        float aumentoFolha = 0.0f;
        int i = 1;

        while (i <= 584) {

            System.out.println("Digite o nome do funcionário: ");
            String nomeFuncionario = leitorScanner.nextLine();

            System.out.println("Digite o salário do funcionário: ");
            float salario = leitorScanner.nextFloat();

            System.out.println("Digite o salário mínimo atualmente: ");
            float salarioMinimo = leitorScanner.nextFloat();
            leitorScanner.nextLine();

            float salarioReajustado;
            float reajuste;

            if (salario < salarioMinimo * 3) {
                reajuste = salario * 0.5f;
            } else if (salario >= salarioMinimo * 3 && salario <= salarioMinimo * 10) {
                reajuste = salario * 0.2f;
            } else if (salario > salarioMinimo * 10 && salario <= salarioMinimo * 20) {
                reajuste = salario * 0.15f;
            } else {
                reajuste = salario * 0.10f;
            }

            salarioReajustado = salario + reajuste;
            aumentoFolha += reajuste;

            System.out.println("Funcionário: " + nomeFuncionario);
            System.out.println("Reajuste: " + reajuste);
            System.out.println("Novo salário: " + salarioReajustado);
            System.out.println("-----------------------------------------");

            i++;
        }

        System.out.println("Aumento total da folha de pagamento: " + aumentoFolha);
    }
}


