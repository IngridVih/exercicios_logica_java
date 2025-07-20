/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class VinteDois {
    public static void main(String[] args){
       
        String nomeProduto;
        float precoCusto;
        float precoVenda;
        
        float totalCusto = 0.0f;
        float totalVenda = 0.0f;
        
        Scanner leitor = new Scanner(System.in);
        
        int i = 0;
        for(; i < 3; i++){
        
            System.out.println("Digite o nome do produto: ");
            nomeProduto = leitor.nextLine();
            
            System.out.println("Digite o preço de custo: ");
            precoCusto = leitor.nextFloat();
            
            System.out.println("Digite o preço de venda: ");
            precoVenda = leitor.nextFloat();
            
            leitor.nextLine();
            
            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;
            
            if(precoCusto == precoVenda){
                System.out.println("Empate!");
            } else if (precoCusto > precoVenda){
                System.out.println("Prejuízo!");
            } else {
                System.out.println("Lucro!");
            }
            System.out.println(nomeProduto + ", preço de custo = " + precoCusto
                + ", preço de venda = " + precoVenda);
        }
        
        System.out.println("A média do preço de custo é de: " + (totalCusto / i));
        System.out.println("A média de preço de venda é de: " + (totalVenda / i));
        
    }        
}
