package com.rebecagomes.poo_lista1_ex6;

import java.util.Scanner;

public class POO_lista1_ex6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o seu salario: ");
        float salario = teclado.nextFloat();
        
        float bonificacao = (float) (salario + (salario * 0.05));
        float imposto = (float) (bonificacao - (bonificacao * 0.07));
        
        System.out.println("O salario com o reajuste: " + imposto);
    }
}
