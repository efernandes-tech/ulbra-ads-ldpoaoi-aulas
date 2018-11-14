/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author ederson.fernandes
 */
public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();
 
        pessoas.add("Ronaldo");
        pessoas.add("Robinho");
        pessoas.add("Rivaldo");
        
        System.out.println("Impressao da ArrayList (usando iterador):");
        
        ListIterator<String> iterator = pessoas.listIterator();
        
        while (iterator.hasNext()) {
            String pessoa = iterator.next();
            System.out.println(pessoa);
        }
    }
    
}
