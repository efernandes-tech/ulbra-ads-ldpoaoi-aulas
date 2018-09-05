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
public class BombaCombustivel {
    
    private String tipoDeCombustivel;
    private double valorPorLitro;
    private double quantidadeDeCombustivel;

    public BombaCombustivel(String tipoDeCombustivel, double valorPorLitro, double quantidadeDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public double getValorPorLitro() {
        return valorPorLitro;
    }

    public void setValorPorLitro(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public double getQuantidadeDeCombustivel() {
        return quantidadeDeCombustivel;
    }

    public void setQuantidadeDeCombustivel(double quantidadeDeCombustivel) {
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }
    
    public double abastecerPorValor(double valor) {
        if (valor >= 0) {
            double qtdCombustivelAbastecido = valor / valorPorLitro;
            if (this.quantidadeDeCombustivel - qtdCombustivelAbastecido >= 0) {
                this.quantidadeDeCombustivel -= qtdCombustivelAbastecido;
                return qtdCombustivelAbastecido;
            }
            return 0;
        }
        return 0;
    }
    
    public double abastecerPorLitro(double qtdLitros) {
        if (qtdLitros >= 0) {
            if (this.quantidadeDeCombustivel - qtdLitros >= 0) {
                double valor = qtdLitros * valorPorLitro;
                this.quantidadeDeCombustivel -= qtdLitros;
                return valor;
            }
            return 0;
        }
        return 0;
    }
    
}

/*
Exercício 19 - Bomba de Combustível
Faça um programa que:

a) Possua uma classe chamada BombaCombustível com, no mínimo, esses atributos:
- tipoDeCombustivel (String).
- valorPorLitro (double)
- quantidadeDeCombustivel (double) - quantidade de combustível disponível na bomba para abastecimento
b) Possua no mínimo esses métodos:
- double abastecerPorValor(double) – método onde é informado o valor a ser abastecido e retorna a quantidade de litros que foi colocada no veículo
- double abastecerPorLitro(double) – método onde é informada a quantidade em litros de combustível e retornado o valor a ser pago pelo cliente.
- Metodos acessores
OBS: Sempre que acontecer um abastecimento é necessário atualizar a quantidade de combustível total na bomba. A bomba não pode ficar com combustível negativo e os métodos de abastecimento não podem abastecer caso seja informado um valor negativo como parâmetro.
*/