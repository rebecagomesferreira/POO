package com.rebecagomes.cadastro;

import java.util.Scanner;

class MenuCadastro{
    void menu(){
        System.out.println("-------Cadastro Aluno-------");
        System.out.println("1 - Cadastrar\n2 - Visualizar\n3 - Sair");
    }
}

class Aluno{
    String nome[];
    long matricula[];
    String curso[];
}
public class Cadastro {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno1 = new Aluno();
        int escolha;
        int num;
        
        
        do{
            MenuCadastro menu1 = new MenuCadastro();
            menu1.menu();
        
            System.out.print("Digite o número de sua escolha: ");
            escolha = teclado.nextInt();
            teclado.nextLine();
            
            System.out.print("Quantos alunos deseja cadastrar: ");
            num = teclado.nextInt();
            teclado.nextLine();
        
            switch(escolha){
                case 1 : 
                    for(int i = 0; i < num; i++){
                    System.out.print("Digite o nome do aluno: ");
                    aluno1.nome[i] = teclado.nextLine();
                    teclado.nextLine();
                    System.out.print("Digite o numero de matricula: ");
                    aluno1.matricula[i] = teclado.nextLong();
                    teclado.nextLine();
                    System.out.print("Digite o curso: ");
                    aluno1.curso[i] = teclado.nextLine();
                    }
                    break;
                
                case 2 : System.out.println("\n--------Cadastro-------");
                for(int i = 0; i < num; i++){
                    System.out.println("Nome: " + aluno1.nome);
                    System.out.println("Matricula: " + aluno1.matricula);
                    System.out.println("Curso: " + aluno1.curso + "\n");}
                    break;
                    
                case 3: System.out.println("Tchau!");
                System.exit(0);
                    break;
                    
                default : System.out.println("Numero invalido."); 
            }
        }while(escolha != 3);
    }
}