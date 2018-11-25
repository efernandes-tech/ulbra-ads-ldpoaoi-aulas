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
public class Vetor {

    public static void main(String[] args) {
        int[] vet = new int[3];
        for (int i = 0; i <= 3; i++) {
            vet[i] = 1;
        }
        for (int valor : vet) {
            System.out.println(valor);
        }
    }

}
