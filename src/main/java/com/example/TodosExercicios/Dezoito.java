/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Dezoito {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite sua idade pessoa " + i);
            int idade = leitorScanner.nextInt();
            
            if(idade >= 18){
                System.out.println("Você é maior de idade!");
            } else {
                System.out.println("Você é menor de idade!");
            }
        }
    
    }
}
