/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Dez {
    
    public static void main(String[] args){
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do produto: ");
        float valorProduto = leitorScanner.nextFloat();
        
        float prestacoes = valorProduto / 5;
        
        System.out.println("O valor das prestações dos produtos fica: " + 
                prestacoes);
        
    }
    
}
