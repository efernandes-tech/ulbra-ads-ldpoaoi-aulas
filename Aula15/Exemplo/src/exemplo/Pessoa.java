/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

/**
 *
 * @author ederson.fernandes
 */
public abstract class Pessoa {

    protected String nome;
    protected int anoNascimento;

    public Pessoa() {
    }

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public abstract void exibirDados();

    public abstract int calcularIdade();
}
