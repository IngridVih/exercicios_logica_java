/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Treze {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o número: ");
        float numero = leitorScanner.nextFloat();
        
        if(numero == 10){
            System.out.print("Esse número é o 10!");
        } else if (numero > 10)  {
            System.out.println("Esse número é maior que 10!");
        } else {
            System.out.println("Esse número é menor que 10!");
        }
    
    }
}
