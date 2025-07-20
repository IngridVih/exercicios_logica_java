/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Vinte {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        char condicaoParada = 'S';
        int contadorCarrosDoisMil = 0;
        int totalGeral = 0;
        
        
        while(condicaoParada == 'S' || condicaoParada == 's'){
            
        System.out.println("Digite o valor do carro: ");
        float valorCarro = leitorScanner.nextFloat();
                
        System.out.println("Digite o ano do carro: ");
        int anoCarro = leitorScanner.nextInt();
        
        float desconto;
        float valorFinal;
        
        if (anoCarro <= 2000){
            desconto = valorCarro * 0.12f;
            valorFinal = valorCarro - desconto;
            System.out.println("O valor do desconto do carro é de: " + desconto);
            System.out.println("Valor a ser pago é de: " + valorFinal);
            contadorCarrosDoisMil++;
        } else {
            desconto = valorCarro * 0.7f;
            valorFinal = valorCarro - desconto;
            System.out.println("O valor do desconto do carro é de: " + desconto);
            System.out.println("Valor a ser pago é de: " + valorFinal);
        }
        
        totalGeral++;
        
        System.out.println("\nDeseja continuar? (S) Sim / (N) Não");
        condicaoParada = leitorScanner.next().charAt(0);
        
        System.out.println("-----------------------------------");       
        
        }
        
        System.out.println("\nResumo final:");
        System.out.println("Total de carros até o ano 2000: " + contadorCarrosDoisMil);
        System.out.println("Total geral de carros processados: " + totalGeral);
        
        
    }
}
