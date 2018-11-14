/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploarraylist;

import java.util.ArrayList;

/**
 *
 * @author ederson.fernandes
 */
public class ArrayListTest2 {

    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();
        
        pessoas.add("Ronaldo");
        pessoas.add("Robinho");
        pessoas.add("Rivaldo");
        
        System.out.println("Impressao da ArrayList (usando indices):");
        
        for (int i = 0; i < pessoas.size(); i++) {
            String pessoa = pessoas.get(i);
            System.out.println(pessoa);
        }
    }

}
