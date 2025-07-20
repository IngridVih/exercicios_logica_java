/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class VinteUm {
    public static void main(String[] args){
    
        Scanner leitor = new Scanner(System.in);
        
        char condicaoParada = 'S';
        int contadorPessoas = 0;
        int contadorPessoasAptas = 0;
        
        while(condicaoParada == 'S' || condicaoParada == 's'){
        
            System.out.println("Digite seu nome: ");
            String nome = leitor.next();
            
            System.out.println("Digite o seu sexo, F ou M: ");
            char sexo = leitor.next().charAt(0);
            
            System.out.println("Digite sua idade: ");
            int idade = leitor.nextInt();
            
            System.out.println("Digite como está sua saúde, Boa, Regular, Péssima: ");
            String saude = leitor.next();
            
            if ((sexo == 'M' || sexo == 'm') && idade >= 18 && saude.equalsIgnoreCase("Boa")){
                System.out.println(nome + " você está apto a cumprir o serviço militar obrigatório.");
                contadorPessoasAptas++;
            } else {
                System.out.println("Você não está apto!");
            }
            
            contadorPessoas++;
            
            System.out.println("\nDeseja continuar? (S) Sim / (N) Não");
            condicaoParada = leitor.next().charAt(0);
        
        System.out.println("-----------------------------------");
        }
        
        System.out.println("A quantidade de pessoas aptas são: " + contadorPessoasAptas);
        System.out.println("O total geral de pessoas é: " + contadorPessoas);
    }
    
}
