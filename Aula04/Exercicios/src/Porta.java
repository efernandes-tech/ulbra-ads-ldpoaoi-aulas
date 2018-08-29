/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Porta {

    private boolean aberta;
    private String cor;
    
    public void abre() {
        this.aberta = true;
    }
    
    public void fecha() {
        this.aberta = false;
    }
    
    public void pinta(String s) {
        this.cor = s;
    }
    
    public boolean estaAberta() {
        return this.aberta;
    }
    
    public String getCor() {
        return this.cor;
    }
    
}
