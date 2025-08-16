
package com.rebecagomes.poo_lista1_ex1;

import java.util.Scanner;

public class POO_lista1_ex1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int soma = 0;
        
        for(int i = 0; i < 4; i++){
            System.out.format("Digite o numero %s: ", i + 1);
            int numero = teclado.nextInt();
            soma += numero;
        }
        
        System.out.format("A soma dos quatro numeros e: %d", soma);
    }
}
