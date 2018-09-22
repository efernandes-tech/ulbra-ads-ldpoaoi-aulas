/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class MetodosPolimorficos {
    
    String nome;
    String eMail;
    int idade;
    char sexo;

    public void setVar(String n) {
        nome = n;
    }

    public void setVar(String n, String em) {
        nome = n;
        eMail = em;
    }

    void alteraCampo(int id) {
        idade = id;
    }

    void alteraCampo(String n) {
        nome = n;
    }

    void alteraCampo(char s) {
        sexo = s;
    }

}
