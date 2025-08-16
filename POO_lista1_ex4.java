package com.rebecagomes.poo_lista1_ex3;

import java.util.Scanner;

public class POO_lista1_ex3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o seu salario: ");
        float salario = teclado.nextFloat();
        
        float reajuste = (float) ((salario * 0.25) + salario);
        
        System.out.println("O salario com reajuste e: " + reajuste);
        
    }
}
