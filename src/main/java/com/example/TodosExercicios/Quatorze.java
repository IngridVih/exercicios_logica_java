/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Quatorze {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int primeiroNumero = leitorScanner.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int segundoNumero = leitorScanner.nextInt();
        
        if (primeiroNumero == segundoNumero){
            System.out.println("Os números são iguais!");
        } else if (primeiroNumero > segundoNumero){
            System.out.println(primeiroNumero + " é maior que " + segundoNumero);
        } else {
            System.out.println(primeiroNumero + " é menor que " + segundoNumero);
        }
    
    }
}
