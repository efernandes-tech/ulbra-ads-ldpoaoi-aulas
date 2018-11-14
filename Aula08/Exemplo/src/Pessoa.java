/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Pessoa extends Object {

    protected String nome;
    protected char sexo;

    public Pessoa() {
    }

    public Pessoa(String nome, char sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Sexo: " + this.sexo);
    }

    public int calculaX() {
        return 999;
    }

}
