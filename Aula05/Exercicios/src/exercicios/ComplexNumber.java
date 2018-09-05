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
public class ComplexNumber {
    
    private double x; // real
    private double y; // img

    public ComplexNumber() {
        this.x = 0;
        this.y = 0;
    }
    
    public ComplexNumber(double x, double y) {
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
    
    public double soma(ComplexNumber cn) {
        double sX = this.x + cn.getX();
        double sY = this.y + cn.getY();
        return sX + sY;
    }
    
    public static ComplexNumber somaDois(ComplexNumber cn1, ComplexNumber cn2) {
        double sX = cn1.getX() + cn2.getX();
        double sY = cn1.getY() + cn2.getY();
        ComplexNumber cn3 = new ComplexNumber(sX, sY);
        return cn3;
    }
    
}

/*
Exercício 20 - Números Complexos
Escreva uma classe chamada ComplexNumber para representar números complexos. 

Números complexos possuem a estrutura z = x + y*i (onde x é a parte real e y é a parte imaginária). 

a. O construtor padrão deve inicializar as partes real e imaginária com zero. Deve haver outro construtor, que possibilite passar os valores como parâmetro. 

b. Escreva um método de instância que some o número complexo passado como parâmetro, dado que a soma de números complexos é definida da seguinte maneira: (a + bi) + (c + di) = (a + c) + (b + d)i. 

c. Escreva um método de classe que some dois números complexos passados como parâmetro e retorne um terceiro número complexo
*/