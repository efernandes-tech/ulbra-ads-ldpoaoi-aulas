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
public class Divide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dividendo = 10;
        int divisor = 0;
        try {
            System.out.println(dividendo / divisor);
        } catch (ArithmeticException e) {
            System.out.println("Divisao por zero");
        }
    }

}
