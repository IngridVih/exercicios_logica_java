/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args){
        
        Scanner leitorScanner = new Scanner(System.in);
        
        System.out.print("Digite a distância total em km: ");
        float distanciaTotal = leitorScanner.nextFloat();
        System.out.print("Digite o gasto total de combustível por litro: ");
        float combustivelTotal = leitorScanner.nextFloat();
        
        float consumoMedio = distanciaTotal / combustivelTotal;
        
        System.out.print("O consumo médio desse automóvel é: " + consumoMedio + 
                "km/l");
        
    }
}
