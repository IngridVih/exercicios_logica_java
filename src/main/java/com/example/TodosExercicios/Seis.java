/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Seis {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o valor da A: ");
        int a = leitorScanner.nextInt();
        
        System.out.println("Digite o valor de B: ");
        int b = leitorScanner.nextInt();
        
        int aux = a;
        
        a = b;
        b = aux;
        
        System.out.println("A agora é: " + a);
        System.out.println("B agora é: " + b);
        
        
        
    }
}
