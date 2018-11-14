/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author ederson.fernandes
 */
public class LinkedListTest {

    public static void main(String[] args) {
        LinkedList<String> pessoas = new LinkedList<>();

        pessoas.addLast("Ronaldo");
        pessoas.addLast("Robinho");
        pessoas.addLast("Rivaldo");

        System.out.println("Impressao da LinkedList:");

        ListIterator<String> iterator = pessoas.listIterator();

        while (iterator.hasNext()) {
            String pessoa = iterator.next();
            System.out.println(pessoa);
        }
    }

}
