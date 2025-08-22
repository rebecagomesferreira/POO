package com.mycompany.aula3;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private double altura;

    /*metodos construtor 
    @paren p_modelo
     */
    public Pessoa(String p_nome, int p_idade, String p_cpf) {
        this.nome = p_nome;
        this.idade = p_idade;
        this.cpf = p_cpf;
    }
    
    /*
    Metodo para que a pessoa se apresente 
    */
    
    public void seApresente(){
        System.out.println("Olá, seu nome eh: " + nome + ", minha idade eh " + idade + ", meu cpf eh: " + cpf);
    }
    
    /*
    Metodos gets
    */
    
    public String getNome(){
        return nome; 
    }
}
