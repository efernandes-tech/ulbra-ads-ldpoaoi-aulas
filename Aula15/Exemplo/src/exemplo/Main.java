/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo;

import java.util.*;

/**
 *
 * @author ederson.fernandes
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Carro> vectorCarros = new ArrayList<Carro>();
        vectorCarros.add(new Carro("Corsa", 10));
        vectorCarros.add(new Carro("Chevete", 1));
        vectorCarros.add(new Carro("Kombi", 4));
        // Imprimir antes da ordenacao.
        System.out.println(vectorCarros);
        // Ordenar.
        Collections.sort(vectorCarros);
        // Imprimir apos a ordenacao.
        System.out.println(vectorCarros);
    }

}
