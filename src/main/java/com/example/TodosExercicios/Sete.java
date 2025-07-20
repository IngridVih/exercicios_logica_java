/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Sete {
    public static void main(String[] args){
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o valor em Celsius: ");
        float celsius = leitorScanner.nextFloat();
        
        float fahrenheit = (9 * celsius + 160) / 5;
        
        System.out.println("Celsius: " + celsius + " vai ficar em Fahrenheit: "
        + fahrenheit);
        
    }
}
