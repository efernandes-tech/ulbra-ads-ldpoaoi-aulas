/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class PortaTest {

    public static void main(String[] args) {
        
        Porta porta = new Porta();
        
        porta.abre();
        
        porta.fecha();
        
        porta.pinta("Vermelho");
        porta.pinta("Verde");
        porta.pinta("Azul");
        
        if (porta.estaAberta()) {
            System.out.println("Porta Esta Aberta");
        } else {
            System.out.println("Porta Esta Fechada");
        }
        
    }
    
}
