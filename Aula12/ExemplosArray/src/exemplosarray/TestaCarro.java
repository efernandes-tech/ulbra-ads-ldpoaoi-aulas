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
public class TestaCarro {

    public static void main(String[] args) {

        Carro vetorCarros[] = new Carro[3];

        vetorCarros[0] = new Carro("Brasilia", "III8564");
        vetorCarros[1] = new Carro("Kombi", "JJJ7675");
        vetorCarros[2] = new Carro("Chevete", "KKK5643");

        for (int i = 0; i < vetorCarros.length; i++) {
            vetorCarros[i].mostrarCarro();
        }
    
    }

}
