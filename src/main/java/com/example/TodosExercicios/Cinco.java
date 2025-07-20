/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args){
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = leitorScanner.nextLine();
        
        System.out.println("Digite a nota da primeira prova: ");
        float primeiraNota = leitorScanner.nextFloat();
        
        System.out.println("Digite a nota da segunda prova: ");
        float segundaNota = leitorScanner.nextFloat();
        
        System.out.println("Digite a nota da terceira prova: ");
        float terceiraNota = leitorScanner.nextFloat();
        
        float mediaNotas = (primeiraNota + segundaNota + terceiraNota) / 3;
        
        System.out.println("O nome do aluno é: " + nomeAluno);
        System.out.println("E a sua média foi: " + mediaNotas);
        
    }
}
