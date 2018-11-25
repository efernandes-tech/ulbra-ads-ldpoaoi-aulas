/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocolecoes;

import java.util.HashSet;

/**
 *
 * @author ederson.fernandes
 */
public class HashSetTest2 {

    public static void main(String[] args) {
        HashSet<String> paises = new HashSet<String>();
        paises.add("Japao");
        paises.add("Brasil");
        paises.add("Estados Unidos");
        paises.add("Brasil");
        paises.add("Japao");
        if (paises.contains("Brasil")) {
            System.out.println("O conjunto contem Brasil");
        }
    }

}
