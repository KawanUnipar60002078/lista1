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
public class exercicio1kawan_reis_60002078 {
    


        public static void main (String[] args) {
        int num1, num2;
        System.out.println("agora vamos calcular uma media");
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe um numero");
        num1 = scanner.nextInt();
        System.out.println("Informe outro numero");
        num2 = scanner.nextInt();
        System.out.println("Resultado media =" + (num1 + num2)/2);
        int resultado = (num1 + num2)/2;
        //media arrumar depois
        if (resultado >= 6){
            System.out.println("aprovado");
        }
        else if (resultado < 6 && resultado > 4){
            System.out.println("faca prova substitutiva");
     
        }else{
            System.out.println("reprovado");
            }  
        }       }