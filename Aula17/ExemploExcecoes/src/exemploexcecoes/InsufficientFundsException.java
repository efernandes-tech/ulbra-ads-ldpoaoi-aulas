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
public class InsufficientFundsException extends RuntimeException {

    public InsufficientFundsException() {
    }

    public InsufficientFundsException(String reason) {
        super(reason);
    }

}
