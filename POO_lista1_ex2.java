package com.rebecagomes.poo_lista1_ex2;
import java.util.Scanner;
public class POO_lista1_ex2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        float nota2 = teclado.nextFloat();
        
        System.out.println("Digite a terceira nota: ");
        float nota3 = teclado.nextFloat();
        
        
        float media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("A media das notas: " + media);
    }
}
