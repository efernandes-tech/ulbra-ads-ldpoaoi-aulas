/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplocolecoes;

import java.util.TreeSet;

/**
 *
 * @author ederson.fernandes
 */
public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet<String> paises = new TreeSet<String>();
        paises.add("Japao");
        paises.add("Brasil");
        paises.add("Estados Unidos");
        System.out.println("Impressao da TreeSet:");
        for (String nomePais : paises) {
            System.out.println(nomePais);
        }
    }

}
