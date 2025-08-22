package com.mycompany.aula3;

public class Principal {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Maria", 45, "12345678922");
        Pessoa p2 = new Pessoa("Antonio", 50, "09876543211");
        Pessoa p3 = new Pessoa("João Pedro", 19, "490721987492");
        
        p1.seApresente();
        p2.seApresente();
        p3.seApresente();
        
        Carro c1 = new Carro("Honda Civic", "Preto", 2020);
        Carro c2 = new Carro("BYG Song Plus", "Branco", 2026);
        Carro c3 = new Carro("Fiat Uno", "Cinza", 1990);
        
        c1.qProprietario(p1);
        c2.qProprietario(p2);
        c3.qProprietario(p3);
    }
    
}
