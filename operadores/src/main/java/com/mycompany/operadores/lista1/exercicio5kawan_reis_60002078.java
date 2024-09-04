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
public class exercicio5kawan_reis_60002078 {
  public static void main (String[] args){
        Scanner impar = new Scanner(System.in);
        int num1;
        System.out.println("informe um numero e confira se o numero e par");
        num1 = impar.nextInt();
        int resultado = num1 %2;
        if (resultado == 1){
            System.out.println("o numero e impar");
        }else{
            System.out.println("o numero e par");
        }
      
    }   
}
