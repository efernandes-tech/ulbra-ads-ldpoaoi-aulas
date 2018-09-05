/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author ederson.fernandes
 */
public class BombaCombustivelTest {
    
    public static void main(String[] args) {
        
        Scanner t = new Scanner(System.in);
        
        int op = 0;
        double valor, qtdLitros;
        
        BombaCombustivel b = new BombaCombustivel("Gasolina", 4.50, 1000);
        
        do {
            System.out.println("1 - Abastecer por valor.");
            System.out.println("2 - Abastecer por qtd. de litros.");
            System.out.println("0 - Sair.");
            op = t.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Digite o valor:");
                    valor = t.nextDouble();
                    System.out.println("Quantidade abastecida: " + b.abastecerPorValor(valor));
                    break;
                case 2:
                    System.out.println("Digite a qtd. de litros:");
                    qtdLitros = t.nextDouble();
                    System.out.println("Quantidade abastecida: " + b.abastecerPorLitro(qtdLitros));
                    break;                    
            }            
            // System.out.println("Quantidade na bomba: " + b.getQuantidadeDeCombustivel());
        } while (op != 0);
        
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