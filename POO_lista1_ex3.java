package com.rebecagomes.poo_lista1_ex5;

import java.util.Scanner;

public class POO_lista1_ex5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        
        System.out.println("Digite a terceira nota: ");
        float nota3 = teclado.nextFloat();
        
        System.out.println("Digite o peso da primeira nota: ");
        float peso1 = teclado.nextFloat();
        
        System.out.println("Digite o peso da primeira nota: ");
        float peso2 = teclado.nextFloat();
        
        System.out.println("Digite o peso da primeira nota: ");
        float peso3 = teclado.nextFloat();
        
        float media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        
        System.out.println("A media das notas: " + media);
    }
}
