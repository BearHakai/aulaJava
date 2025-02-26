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
public class writeAndRead {
    
    public static void main(String[] args) {
        
        Scanner scaning = new Scanner(System.in);
        
        System.out.println("Digite o Primeiro valor");
        int valorOne = scaning.nextInt();
        
        System.out.println("Digite o Segundo valor");
        int valorTwo = scaning.nextInt();
        
        int result = valorOne + valorTwo;

        System.out.println("O valor da soma é: " + result);        
    }
    
}
