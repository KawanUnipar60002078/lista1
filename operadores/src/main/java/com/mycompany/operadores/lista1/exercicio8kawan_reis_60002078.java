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
public class exercicio8kawan_reis_60002078 {
     public static void main(String[] args) {
        
        int dia1 , dia30, consumo, media;
        Scanner agua = new Scanner(System.in);
            System.out.println("informe a quantidade de agua no primeiro dia do mes");
        dia1 = agua.nextInt();
            System.out.println("informe a quantidade de agua no ultimo dia do mes");
        dia30 = agua.nextInt();
        consumo = dia30 - dia1;
        media = consumo / 30;
            System.out.println("sua media de consumo diario foi de " +  media );
            System.out.println("e o seu consumo foi de " + consumo);
        }
}
