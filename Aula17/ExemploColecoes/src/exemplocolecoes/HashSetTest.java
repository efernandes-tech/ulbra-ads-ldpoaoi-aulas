/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocolecoes;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author ederson.fernandes
 */
public class HashSetTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> paises = new HashSet<>();
        paises.add("Japao");
        paises.add("Brasil");
        paises.add("Estados Unidos");
        paises.add("Brasil");
        paises.add("Japao");
        System.out.println("Impressao da HashSet:");
        Iterator<String> iterator = paises.iterator();
        while (iterator.hasNext()) {
            String nomePais = iterator.next();
            System.out.println(nomePais);
        }
    }

}
