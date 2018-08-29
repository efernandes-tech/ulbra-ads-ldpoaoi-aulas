/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Empregado {
    
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void aumentaSalario(double percentual) {
        if (percentual > 0.0) {
            this.salario += this.salario * percentual;
            if (this.salario < 0.0) {
                this.salario = 0;
            }
        }
    }
    
}
