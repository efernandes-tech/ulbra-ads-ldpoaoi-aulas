/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploexcecoes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author ederson.fernandes
 */
public class TesteExcecoes5 {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Quantos anos voce tem ?");
            String inputLine = in.readLine();
            int idade = Integer.parseInt(inputLine);
            idade++;
            System.out.println("No proximo ano voce tera: " + idade);
        } catch (Exception exception) {
            // Detonamos as excecoes.
            // Na verdade elas nao foram tratadas.
        }
    }

}
