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
public class exercicio7kawan_reis_60002078 {
    public static void main (String[] args) {
    int num1,num2;
     Scanner sc = new Scanner(System.in);
        System.out.println("comparacao de maior igual diferente ou menor");
        num1 = sc.nextInt();
        System.out.println("informe outro numero");
       num2 = sc.nextInt();
        System.out.println("numeros diferentes? " +(num1 != num2));
        System.out.println("numeros iguais? " + (num1 == num2));
        System.out.println("num1 maior? " + (num1 > num2));
        System.out.println("num1 menor?  " + (num1 < num2));
}
}