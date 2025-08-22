package com.mycompany.aula3;

public class Carro {

    private String modelo;
    private String cor;
    private int ano;

    public Carro(String p_modelo, String p_cor, int p_ano) {
        this.modelo = p_modelo;
        this.cor = p_cor;
        this.ano = p_ano;
    }
    
    /*
    Define o proprietario do veiculo
    */
    public void qProprietario(Pessoa p){
        System.out.println("O dono do carro " + modelo 
        + ", eh " + p.getNome());
    }
}
