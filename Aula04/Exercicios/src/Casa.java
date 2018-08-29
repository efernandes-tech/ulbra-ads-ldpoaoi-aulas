/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Casa {
    
    private String cor;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;
    
    public void pinta(String s) {
        this.cor = s;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        cont += (this.porta1.estaAberta() ? 1 : 0);
        cont += (this.porta2.estaAberta() ? 1 : 0);
        cont += (this.porta3.estaAberta() ? 1 : 0);
        return cont;
    }
    
    public int totalDePortasInstaladas() {
        int cont = 0;
        cont += (this.porta1 != null ? 1 : 0);
        cont += (this.porta2 != null ? 1 : 0);
        cont += (this.porta3 != null ? 1 : 0);
        return cont;
    }
    
}
