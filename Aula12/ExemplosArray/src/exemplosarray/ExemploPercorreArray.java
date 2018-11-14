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
public class ExemploPercorreArray {

    public static void main(String[] args) {
        int valores[] = {65, 12, 90, 15, 21, 45};
        // Imprimindo valores.
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        for(int inteiro : valores) {
            System.out.println(inteiro);
        }
    }

}
