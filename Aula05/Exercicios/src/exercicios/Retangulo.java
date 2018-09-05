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
public class Retangulo {
  
    private double altura;
    private double largura;
    private Ponto vertice;

    public Retangulo(double altura, double largura, Ponto vertice) {
        this.altura = altura;
        this.largura = largura;
        this.vertice = vertice;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public Ponto getVertice() {
        return vertice;
    }

    public void setVertice(Ponto vertice) {
        this.vertice = vertice;
    }
    
    public Ponto getCentro() {
        double x, y;
        x = this.vertice.getX() + (this.largura / 2);
        y = this.vertice.getY() + (this.altura / 2);
        Ponto p = new Ponto(x, y);
        return p;
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