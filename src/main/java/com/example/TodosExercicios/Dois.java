/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        float primeiroNumero = leitorScanner.nextFloat();
        
        System.out.print("Digite o segundo número: ");
        float segundoNumero = leitorScanner.nextFloat();
        
        float soma = primeiroNumero + segundoNumero;
        float subtracao = primeiroNumero - segundoNumero;
        float multiplicacao = primeiroNumero * segundoNumero;
        float divisao = primeiroNumero / segundoNumero;
        
        System.out.println("Os números digitados foram: " 
                + primeiroNumero + " e " + segundoNumero);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        
    }
}
