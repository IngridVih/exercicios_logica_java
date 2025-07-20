/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;
//Estou orgulhosa desse código!
import java.util.Scanner;

public class Dezenove {
    public static void main(String[] args){
        
        Scanner leitorScanner = new Scanner(System.in);
        int contadorMulheres = 0;
        int contadorHomens = 0; 
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite seu nome pessoa " + i + " :");
            String nome = leitorScanner.next();
            
            System.out.print("Digite seu sexo, F - feminino e M - masculino: ");
            char sexo = leitorScanner.next().charAt(0);
            
            if(sexo == 'F' || sexo == 'f'){
                contadorMulheres++;
                System.out.println("Ela é uma mulher e se chama: " + nome);
            } else {
                contadorHomens++;
                System.out.println("Ele é um homem e se chama: " + nome);
            }
        }
        System.out.println("A quantidade de mulheres é: " + contadorMulheres);
        System.out.println("A quantidade de homens é: " + contadorHomens);
    }
}
