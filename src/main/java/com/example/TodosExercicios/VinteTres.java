/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class VinteTres {
    public static void main(String[] args){
    
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();
        
        if(numero > 80 || numero < 25 || numero == 40){
            System.out.println("O número está no intervalo");
        } else {
            System.out.println("O número não está no intervalo");
        }
    }
}
