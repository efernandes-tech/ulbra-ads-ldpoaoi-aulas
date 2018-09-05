/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author ederson.fernandes
 */
public class Tamagoshi {
 
    private String nome;
    private boolean fome;
    private boolean saude;
    private int idade;

    public Tamagoshi(String nome, int idade) {
        this.nome = nome;
        this.fome = false;
        this.saude = false;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getFome() {
        return fome;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public boolean getSaude() {
        return saude;
    }

    public void setSaude(boolean saude) {
        this.saude = saude;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public boolean getHumor() {
        return this.fome && this.saude;
    }
    
}
