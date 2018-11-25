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
public class ContaBancaria2 {

    public double saldo;
    
    public void sacar(double valor) throws InsufficientFundsException {
        if (valor > saldo) {
            throw new InsufficientFundsException("Saque de " + valor + " excede o saldo de " + saldo);
        }
        saldo -= valor;
    }

}
