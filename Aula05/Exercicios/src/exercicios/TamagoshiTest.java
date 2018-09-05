/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author ederson.fernandes
 */
public class TamagoshiTest {

    public static void main(String[] args) {
     
        Tamagoshi t1 = new Tamagoshi("Pedro", 1);
        Tamagoshi t2 = new Tamagoshi("Maria", 2);   
        
        t1.setFome(true);
        t1.setSaude(true);
        
        t2.setFome(false);
        t2.setSaude(true);
        
        System.out.println("Humor do " + t1.getNome() + " é " + t1.getHumor());
        System.out.println("Humor do " + t2.getNome() + " é " + t2.getHumor());
        
    }

}
