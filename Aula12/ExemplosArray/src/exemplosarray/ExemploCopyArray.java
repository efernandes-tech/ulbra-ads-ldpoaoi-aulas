/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosarray;

/**
 *
 * @author ederson.fernandes
 */
public class ExemploCopyArray {

    public static void main(String[] args) {
        int vetor1[] = {1, 3, 5, 7, 9, 11};
        int vetor2[] = {21, 23, 25, 27, 29, 31};
        // Copia na mao.
        // for (int i = 0; i < vetor1.length; i++) {
            // vetor2[i] = vetor1[i];
        // }
        // Copiando com "arraycopy".
        System.arraycopy(vetor1, 0, vetor2, 0, 6);
    }

}
