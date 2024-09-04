/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operadores.lista1;

import java.util.Scanner;

/**
 *
 * @author kawan
 */
public class exercicio10kawan_reis_60002078 {
     public static void main (String[] args){
        Scanner potencias = new Scanner(System.in);
        double num1;
        System.out.println("digite um numero se >=10 e <=100 ele elevara a 2 se nao ele ira calcular a raiz ");
        num1 = potencias.nextInt();
        if (num1 >= 10 && num1 <= 100){
            System.out.printf("o numero elevado a 2 e %.5f " , (num1 * num1));
            
        }else{
            System.out.printf("a raiz donumero e %.5f" , (Math.sqrt(num1)));
    }
  }
    
}
