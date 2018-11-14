/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosarray;

import java.util.Arrays;

/**
 *
 * @author ederson.fernandes
 */
public class ExemploOrderArray {

    public static void main(String[] args) {
        int valores[] = {65, 12, 90, 15, 21, 45};
        Arrays.sort(valores);
        // Imprimindo valores.
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

}
