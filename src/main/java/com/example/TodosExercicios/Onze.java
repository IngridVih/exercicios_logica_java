/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Onze {
    
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o preço de custo: ");
        float precoCusto = leitorScanner.nextFloat();
        
        System.out.println("Digite o percentual (exemplo: 0.1 para 10%):");
        float percentual = leitorScanner.nextFloat();
        
        float valorVenda = precoCusto + (precoCusto * percentual);
        
        System.out.println("O valor de venda do produto é: " + valorVenda);
        
        leitorScanner.close(); // boa prática
    }
}
