/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class VinteCinco {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        float primeiroNumero = leitorScanner.nextFloat();
        
        System.out.println("Digite o segundo número: ");
        float segundoNumero = leitorScanner.nextFloat();
        
        if (primeiroNumero == segundoNumero){
            System.out.println("Os números são iguais!");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println(primeiroNumero + " é maior que " + segundoNumero);
            System.out.println("Os números são diferentes!");
        } else {
            System.out.println(segundoNumero + " é maior que " + primeiroNumero);
            System.out.println("Os números são diferentes! ");
        }
        
    }
}
