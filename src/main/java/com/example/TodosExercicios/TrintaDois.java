/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class TrintaDois {
    public static void main(String[] args){
    
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int ladoA = leitor.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int ladoB = leitor.nextInt();
        
        System.out.println("Digite o terceiro valor: ");
        int ladoC = leitor.nextInt();
        
        if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {

            System.out.println("Os valores formam um triângulo.");

            if (ladoA == ladoB && ladoB == ladoC) {
                System.out.println("Triângulo Equilátero.");
            } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
                System.out.println("Triângulo Isóscele.");
            } else {
                System.out.println("Triângulo Escaleno.");
            }

        } else {
            System.out.println("Os valores não formam um triângulo.");
        }
    }
}
