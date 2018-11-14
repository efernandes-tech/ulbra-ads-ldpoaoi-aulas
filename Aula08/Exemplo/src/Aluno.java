/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Aluno extends Pessoa {

    public int matricula;
    private final int numMaximoDisciplinasSemestre = 5;

    /* Atributos herdados
    public String nome;
    public char sexo; */
    public Aluno(String nome, char sexo, int matricula) {
        super(nome, sexo);
        this.matricula = matricula;
    }

    public Aluno() {
        this("", ' ', 0);
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Matricula: " + matricula);
    }

    public final void teste() {
        int x = 0;
        x = calculaX(); // chamou o método definido na superclasse
        x = super.calculaX(); // igual a linha acima
    }

}
