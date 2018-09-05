package exercicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Ponto {
    
    private double x;
    private double y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String imprimir() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
    
}

/*
Exercício 18 - Ponto e Retângulo
Faça um programa que:
a) Possua uma classe chamada Ponto, com os atibutos X e Y (ambos double), representando um ponto em um plano e seus métodos acessores.
b) Possua uma classe chamada Retângulo, com os atributos altura e largura (ambos double)e seus métodos acessores
c) Crie um método dentre da classe Ponto para imprimir o valor dos seus atributos.
d) O Retângulo deve ter um atributo vértice, que é o ponto do vértice superior esquerdo do Retângulo.
e) A classe Retangulo deve possuir um método chamado getCentro, que deve retornar o Ponto central do Retangulo.

f) Crie alguns objetos da classe Retangulo e defina os valores deles
g) Descubra os pontos de centro de cada um dos retângulos
h) Imprima os valores do pontos
*/