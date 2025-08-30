/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rebecagomes.pessoa;

/**
 *
 * @author Usuário
 */
public class Pessoa {

    public static void main(String[] args) {
        ExemploPessoa maria;
        maria = new ExemploPessoa();
        maria.idade = 18;
        maria.sexo = 'f';
        maria.mensagem();
        
        System.out.println(maria.idade);
        System.out.println(maria.sexo);
    }
    
}
