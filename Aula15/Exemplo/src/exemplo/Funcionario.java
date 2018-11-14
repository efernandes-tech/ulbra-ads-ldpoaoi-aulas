/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.util.Calendar;

/**
 *
 * @author ederson.fernandes
 */
public class Funcionario extends Pessoa {

    public Funcionario(String nome, int anoNascimento) {
        super(nome, anoNascimento);
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano de Nascimento: " + this.anoNascimento);
    }

    @Override
    public int calcularIdade() {
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        return (this.anoNascimento - anoAtual) * -1;
    }

}
