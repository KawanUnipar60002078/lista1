/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operadores;

import java.util.Scanner;

/**
 *
 * @author kawan
 */
public class Operadores {
   static Scanner s = new Scanner(System.in);
     public static void main(String[] args) {
       // int num1, num2;
        double num1 , num2; 
        System.out.println("Informe num1 ");
        num1 = s.nextInt();
        System.out.println("Informe num2 ");
        num2 = s.nextInt();
        System.out.println("Exemplos oeradores aritimeticos: ");
        System.out.println("Adicao " + (num1 + num2));
        System.out.println("divisao " + (num1 / num2));
        System.out.println("subtracao " + (num1 - num2));
        System.out.println("multiplicacao " + (num1 * num2));
        calculomedia();
        genero();
        consumoagua();
        imparpar();
        maiorouigual();
        numeroElevado();
        potencias();
    }
        public static void calculomedia() {
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
        }
        public static void genero() {
        String nome;
        nome = "Kawan";
        int idade;
        System.out.println("Informe um nome: ");
        nome = s.next();
        System.out.println("Informe idade");
        idade = s.nextInt();
         System.out.println("Informe genero ");
        nome = s.next();
        System.out.println("Informe sua cor favorita");
        nome = s.next();
         System.out.println("Informe se voce pratica esportes ");
        nome = s.next();
        }
         public static void maiorouigual() {
    int num1,num2;
     Scanner sc = new Scanner(System.in);
        System.out.println("comparacao de maior igual ou menor");
        num1 = sc.nextInt();
        System.out.println("informe outro numero");
       num2 = sc.nextInt();
         if (num1 > num2){
        System.out.println("o numero 1 e maior");
    }else if (num1 < num2){
            System.out.println("o numero 1 e menor");
}else{
            System.out.println("os numeros sao iguais");
            }
    
    }

    
    
    
    public static void imparpar(){
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

    
    //exercicio 8
        public static void consumoagua(){
        
        int dia1 , dia30, consumo;
        Scanner agua = new Scanner(System.in);
            System.out.println("informe a quantidade de agua no primeiro dia do mes");
        dia1 = agua.nextInt();
            System.out.println("informe a quantidade de agua no ultimo dia do mes");
        dia30 = agua.nextInt();
        consumo = dia30 / 30;
            System.out.println("sua media de consumo diario foi de " + consumo);
            System.out.println("e o seu consumo foi de " + dia30);
        }
    
    public static void numeroElevado(){
    int num1;
    
    Scanner elevado = new Scanner(System.in);
        System.out.println("Digite um numero para elevar ele a 2, 4,  6, 8 e 10 ");
        num1 = elevado.nextInt();
        System.out.println("elevado a 2 " + (num1 * num1));
        System.out.println("elevado a 4 " + (num1 * num1 * num1 * num1));
        System.out.println("elevado a 6 " + (num1 * num1 * num1 * num1 * num1 * num1));
        System.out.println("elevado a 10 " + ((num1 * num1 * num1 * num1 * num1) * num1 * num1 * num1 * num1 * num1));
}
 //descobrir como calcula raiz qudrada depois   
    public static void potencias(){
        Scanner potencias = new Scanner(System.in);
        double num1;
        System.out.println("digite um numero se >=10 e <=100 ele elevara a 2 se nao ele ira calcular a raiz ");
        num1 = potencias.nextInt();
        if (num1 >= 10 && num1 <= 100){
            System.out.println("o numero elevado a 2 e " + num1 * num1);
            
        }else{
            System.out.println("a raiz donumero e " + (Math.sqrt(num1)));
    }
  }
   
}

