
package com.POOSEXTA;

import java.util.Scanner;
        
public class Cadastro_de_alunos {

    public static void main(String[] args){
        System.out.println("---------Cadastro de alunos---------");
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\nDigite a quantidade de alunos que deseja matricular: ");
        int num = teclado.nextInt();
        
        String[] nome = new String[num];
        int[] matricula = new int[num];
        int[] idade = new int [num];
        String[] curso =  new String[num];
        
        for(int i = 0; i < num; i++){
            System.out.format("\nAluno %s\n", i + 1);
            teclado.nextLine();
            
            System.out.println("Digite o nome do aluno: ");
            nome[i] = teclado.nextLine();
            
            System.out.println("Digite o numero de matricula do aluno: ");
            matricula[i] = teclado.nextInt();
            teclado.nextLine();
            
            System.out.println("Digite o curso do aluno: ");
            curso[i] = teclado.nextLine();
            
            System.out.println("Digite a idade do aluno: ");
            idade[i] = teclado.nextInt();
            teclado.nextLine();
            
        }
        
        System.out.println("\n----------Cadastros realizados-----------");
        
        for(int i = 0; i < num; i++){
            System.out.format("\nCadastro do aluno %s\nNome do aluno: %s\nNumero de matricula: %d\nCurso do Aluno: %s\nIdade do aluno: %d\n", i + 1, nome[i], matricula[i], curso[i], idade[i]);
        }
    }
}

