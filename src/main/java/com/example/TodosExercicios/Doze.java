/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Doze {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        float percentualDistribuidor = 0.28f;
        float impostosAplicados = 0.45f;
        
        System.out.println("Digite o custo de fábrica: ");
        float custoFabrica = leitorScanner.nextFloat();
        
        float custoComImpostos = custoFabrica + (custoFabrica * impostosAplicados);
        float custoCarro = custoComImpostos + (custoComImpostos * percentualDistribuidor);
        
        System.out.println("O custo final ao consumidor é: R$ " + custoCarro);
        
        leitorScanner.close();
    
    }
}
