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
public class PontoRetanguloTest {
  
    public static void main(String[] args) {
        
        Ponto p1 = new Ponto(0, 0);
        Retangulo r1 = new Retangulo(50, 100, p1);
        System.out.println("Ponto Central: " + r1.getCentro().imprimir());
        
        Ponto p2 = new Ponto(50, 100);
        Retangulo r2 = new Retangulo(500, 1000, p2);
        System.out.println("Ponto Central: " + r2.getCentro().imprimir());
        
        System.out.println(p1.imprimir());
        System.out.println(p2.imprimir());
        
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