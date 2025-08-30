package com.rebecagomes.treinoclasses;

class Aluno {
    String nome; // parâmetros
    long matricula;
    String curso;
    int idade;
    boolean ativo;
    
    void mensagem(){ //método
        System.out.println("Cadastro de aluno:");
    }
    
    String instituição(String faculdade){
        faculdade = "UCB";
        return faculdade;
    }
    
    String pegarNomeClasse(){
        return "Aluno";
    }
}
