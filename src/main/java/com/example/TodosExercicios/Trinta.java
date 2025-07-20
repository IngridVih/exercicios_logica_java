/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;
import java.util.Arrays;

public class Trinta {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int primeiroNumero = leitorScanner.nextInt();
        
        System.out.println("Digite o segundo valor: ");
        int segundoNumero = leitorScanner.nextInt();
        
        System.out.println("Digite o terceiro valor: ");
        int terceiroNumero = leitorScanner.nextInt();
        
        int[] numeros = {primeiroNumero, segundoNumero, terceiroNumero};
        
        Arrays.sort(numeros);
        
        System.out.println("---------------------------------------");
        
        for (int numero : numeros){
            System.out.println(numero);
        }
        
    }
}
