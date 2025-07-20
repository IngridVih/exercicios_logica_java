/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.TodosExercicios;

import java.util.Scanner;

public class VinteNove {
    public static void main(String[] args){
    
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o número do mês: ");
        int numeroMes = leitor.nextInt();
        
        switch(numeroMes){
            case 1:
                System.out.println("Mês 1 - Janeiro");
                break;
            case 2:
                System.out.println("Mês 2 - Fevereiro");
                break;
            case 3:
                System.out.println("Mês 3 - Março");
                break;
            case 4:
                System.out.println("Mês 4 - Abril");
                break;
            case 5:
                System.out.println("Mês 5 - Maio");
                break;
            case 6:
                System.out.println("Mês 6 - Junho");
                break;
            case 7:
                System.out.println("Mês 7 - Julho");
                break;
            case 8:
                System.out.println("Mês 8 - Agosto");
                break;
            case 9:
                System.out.println("Mês 9 - Setembro");
                break;
            case 10:
                System.out.println("Mês 10 - Outubo");
                break;
            case 11:
                System.out.println("Mês 11 - Novembro");
                break;
            case 12:
                System.out.println("Mês 12 - Dezembro");
                break;
            default:
                System.out.println("Mês inválido");
                break;
        }
    }
}
