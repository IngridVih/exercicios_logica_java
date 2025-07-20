/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class TrintaUm {
    public static void main(String[] args){
    
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        double a = leitor.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        double b = leitor.nextDouble();
        
        System.out.println("Digite o valor de C: ");
        char operador = leitor.next().charAt(0);
        
        double resultado;
        
        switch (operador){
        
            case '+':
                resultado = a + b;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.print("Resultado: " + resultado);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Erro: Divisão por zero não permitida.");
                } else {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            default:
                System.out.println("Operdaor não definido!");
        }
        
    }
}
