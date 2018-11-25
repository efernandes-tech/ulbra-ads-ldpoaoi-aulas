/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcecoes;

/**
 *
 * @author ederson.fernandes
 */
public class ContaBancaria {
    
    public double saldo;

    public void sacar(double valor) {
        if (valor > saldo) {
            IllegalArgumentException exception = new IllegalArgumentException("O valor ultrapassa o saldo !");
            throw exception;
        }
        saldo -= valor;
    }

}
