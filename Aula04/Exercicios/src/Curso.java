/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Curso {
    
    private int numero;
    private String nome;
    private Professor professor;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public String exibeDados() {
        return "Numero do curso: " + this.numero + "\n"
                + "Nome do curso: " + this.nome + "\n"
                + "Nome do professor: " + this.professor.getNome();
    }
    
}
