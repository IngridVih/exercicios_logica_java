/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Quatro {
    public static void main(String[] args){
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite o nome do vendedor: ");
        String nome = leitorScanner.nextLine();
        
        System.out.print("Digite o seu salário fixo: ");
        float salarioFixo = leitorScanner.nextFloat();
        
        System.out.print("Digite o total de vendas efetuadas: ");
        int totalVendas = leitorScanner.nextInt();
        
        float comissao = totalVendas * 0.15f;
        
        float salarioFinal = salarioFixo + comissao;
        
        System.out.println("\nResumo do vendedor:");
        System.out.println("Nome: " + nome);
        System.out.println("Salário fixo: R$ " + salarioFixo);
        System.out.println("Salário final com comissão: R$ " + salarioFinal);
        
    }
}
