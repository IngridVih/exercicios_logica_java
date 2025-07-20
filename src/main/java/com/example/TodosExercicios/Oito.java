/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Oito {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de dólares: ");
        float dolar = leitorScanner.nextFloat();
        
        System.out.println("Digite a cotação do dólar");
        float dolarCotacao = leitorScanner.nextFloat();
        
        float conversao = dolar * dolarCotacao;
        
        System.out.println("O valor em reais é: " + conversao);
        
    }
}
