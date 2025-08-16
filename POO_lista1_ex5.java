package com.rebecagomes.poo_lista1_ex4;

import java.util.Scanner;

public class POO_lista1_ex4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite seu salario: ");
        float salario = teclado.nextFloat();
        
        System.out.println("Digite o persentual: ");
        float percentual = teclado.nextFloat();
        
        float aumento = (salario * percentual / 100) + salario;
        
        System.out.println("Salario com reajuste: " + aumento);
    }
}
