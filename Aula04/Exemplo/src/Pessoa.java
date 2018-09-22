/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Pessoa {

    private String nome;
    private int idade;
    private static int nroPessoas;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.nroPessoas++;
    }

    public int getNroInstancias() {
        return nroPessoas;
    }
    
}
