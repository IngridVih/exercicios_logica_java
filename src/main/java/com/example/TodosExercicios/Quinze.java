/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Quinze {
    
    public static void main(String[] args){
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o número: ");
        float numero = leitorScanner.nextFloat();
        
        if (numero >= 100 && numero <= 200){
            System.out.println("O número: " + numero + " está entre 100 e 200.");
        } else {
            System.out.println("O número: " + numero + " não está no intervalo.");
        }
    }
}
