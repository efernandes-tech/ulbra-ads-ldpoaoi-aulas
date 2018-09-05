/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class Carro {

    private String cor;
    private double capacidadeDoMotor;
    private int velocidade;

    public Carro(String cor, double capacidadeDoMotor) {
        this.cor = cor;
        this.capacidadeDoMotor = capacidadeDoMotor;
        this.velocidade = 0;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCapacidadeDoMotor() {
        return capacidadeDoMotor;
    }

    public void setCapacidadeDoMotor(double capacidadeDoMotor) {
        this.capacidadeDoMotor = capacidadeDoMotor;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }   

    public void aumentarVelocidade(int v) {
        if (v <= 0) {
            System.out.println("Velocidade Invalida");
        } else if ((this.velocidade + v) > (this.capacidadeDoMotor * 110)) {
            System.out.println("Limite Atingido");
        } else {
            this.velocidade += v;
        }
    }

    public void reduzirVelocidade(int v) {
        if (v <= 0) {
            System.out.println("Velocidade Invalida");
        } else if ((this.velocidade + v) < 0) {
            System.out.println("Velocidade Negativa");
        } else {
            if (v > 60) {
                System.out.println("Air-Bag");
            }
            this.velocidade -= v;
        }
    }

    public String mostraDados() {
        return "Carro{" + "cor=" + cor + ", capacidadeDoMotor=" + capacidadeDoMotor + ", velocidade=" + velocidade + '}';
    }

    
    
}
