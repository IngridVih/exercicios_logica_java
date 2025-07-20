/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Nove {
    
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o valor do deposito: ");
        float deposito = leitorScanner.nextFloat();
        
        float rendimento = deposito * 0.0007f;
        
        float valorTotal = rendimento + deposito;
        
        System.out.println("O valor do deposito com o rendimento foi de: " + 
                valorTotal);
        
    }
}
