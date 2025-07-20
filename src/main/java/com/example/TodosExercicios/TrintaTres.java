/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class TrintaTres {
    public static void main(String[] args){
    
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nível do professor: ");
        int nivel = leitor.nextInt();
        
        System.out.println("Digite o total de horas: ");
        float horas = leitor.nextFloat();
        
        float salario;
        
        switch (nivel) {
            case 1:
                salario = 12 * horas;
                System.out.print("O salário total do professor é: R$" + salario);
                break;
            case 2:
                salario = 17 * horas;
                System.out.print("O salário total do professor é: R$" + salario);
                break;
            case 3:
                salario = 25 * horas;
                System.out.print("O salário total do professor é: R$" + salario);
                break;
            default:
                System.out.println("Insira corretamente o nível.");
        }
    }
}
