/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Dezesseis {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = leitorScanner.next();
        
        System.out.println("Digite a primeira nota: ");
        float primeiraNota = leitorScanner.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        float segundaNota = leitorScanner.nextFloat();
        
        System.out.println("Digite a terceira nota: ");
        float terceiraNota = leitorScanner.nextFloat();
    
        float media = (primeiraNota + segundaNota + terceiraNota) / 3;
        
        if (media >= 7){
            System.out.println("O aluno(a): " + nomeAluno + " teve a menção: "
                    + "APROVADO! Com uma media de: " + media);
        } else if (media <= 5) {
            System.out.println("O aluno(a): " + nomeAluno + " teve a menção: "
                    + "REPROVADO! Com uma media de: " + media);
        } else {
            System.out.println("O aluno(a): " + nomeAluno + " está de R"
                    + "ECUPERAÇÃO! Com uma media de: " + media);
        }
    }
}
