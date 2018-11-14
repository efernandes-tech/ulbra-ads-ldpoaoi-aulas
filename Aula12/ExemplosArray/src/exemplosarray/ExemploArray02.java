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
public class ExemploArray02 {

    public static void main(String[] args) {
        int valores[] = {10, 20, 30, 40, 50, 60};
        System.out.println("O tamanho: " + valores.length);
        valores[1] = 25;
        valores[3] = 45;
        // Imprimindo valores.
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }

}
