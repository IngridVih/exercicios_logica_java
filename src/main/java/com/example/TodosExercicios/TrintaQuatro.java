/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class TrintaQuatro {
    public static void main(String[] args){
    
        Scanner leitorIdades = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = leitorIdades.nextInt();
        
        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A (5 a 7 anos).");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: Infantil B (8 a 10 anos).");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: Juvenil A (11 a 13 anos).");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B (14 a 17 anos).");
        } else if (idade >= 18 && idade <= 25) {
            System.out.println("Categoria: Sênior (18 a 25 anos).");
        } else {
            System.out.println("Idade fora da faixa etária.");
        }
    }
}
