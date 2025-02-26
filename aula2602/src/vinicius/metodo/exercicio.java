/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vinicius.metodo;

import java.util.Scanner;

/**
 *
 * @author VINICIUS_4820
 */
public class exercicio {
    
    public static void main(String[] args) {
        
         Scanner scanning = new Scanner(System.in);
         
         System.out.println("Digite o Primeiro valor: ");
         int valorOne = scanning.nextInt();
         
         System.out.println("Digite o Segundo valor: ");
         int valorTwo = scanning.nextInt();
         
         System.out.println("Digite o operação que deseja realizar: \n(+)Adição\n(-)Subtração\n(/)Divisão\n(*)Multiplicação");
         String operator = scanning.next();
         
         if("+".equals(operator)){
             
             int result = valorOne + valorTwo;
             System.out.println("O valor da soma é: " + result);
         }
         
         else if("-".equals(operator)){
         
             int result = valorOne - valorTwo;
             System.out.println("O valor da subtração é: " + result);
             
         }
         
         else if("/".equals(operator)){
         
             int result = valorOne / valorTwo;
             System.out.println("O valor da divisão é: " + result);
             
         }
         
         else if("*".equals(operator)){
         
             int result = valorOne * valorTwo;
             System.out.println("O valor da multiplicação é: " + result);
             
         }
         
        
    }
}
