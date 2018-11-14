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
public class ExemploArray01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char vogais[] = new char[5];
        vogais[0]='a';
        vogais[1]='e';
        vogais[2]='i';
        vogais[3]='o';
        vogais[4]='u';
        // Uma outra opcao seria:
        // char vogais[] = {'a', 'e', 'i', 'o', 'u'};
        
        // Impressao das vogais.
        for(int i=0; i<vogais.length; i++){
            System.out.println(vogais[i]);
        }
    }
    
}
