package com.rebecagomes.exemploford;
 class ExemploFord {

    public static void main(String[] args) {
       /* Carro ford;
        ford = new Carro();
        ford.ano = 2012;
        ford.cor = "Branco";
        ford.modelo = "fiesta";
        
        System.out.println(ford.ano);
        System.out.println(ford.cor);
        System.out.println(ford.modelo);*/
        
        Carro honda;
        honda = new Carro();
        
        honda.valor = 50000.00;
        
        Carro jep;
        jep = new Carro();
        
        jep.valor = 37000.00;
        
        Reajuste reaju;
        reaju = new Reajuste();
        
        double valor1 = 100.00, valor2 = 212.00; //passagem por parâmetro
        
        reaju.calculaValor(valor1);
        System.out.println(valog
        reaju.calculaValor(valor2);
        System.out.println(valor2);//212
        
        reaju.calculaCarro(honda); // passagem por referencia alterando o valor
        System.out.println(honda.valor);
        reaju.calculaCarro(jep);
        System.out.println(jep.valor);
    }
}
