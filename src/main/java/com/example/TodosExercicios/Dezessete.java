/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;
/**
 * 
 * Nunca que eu iria fazer de 80 números LOL!
 */
public class Dezessete {
    public static void main(String[] args){
    
        Scanner leitorScanner = new Scanner(System.in);
        int contador = 0;
       
        for(int i = 1; i <=3; i++){
            System.out.println("Digite o " + i + "º número: ");
            int numero = leitorScanner.nextInt();
           if(numero >= 10 && numero <=150){
               contador++;
        } 
    }
        System.out.println("Quantidade de números no intervalo entre 10 e 150: " 
            + contador);
    }
}
