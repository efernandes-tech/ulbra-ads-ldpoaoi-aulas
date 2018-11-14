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
public class ExemploArrayMulti {

    public static void main(String[] args) {
        int matriz1[][] = new int[3][5];
        // Matriz de 4 linhas e 3 colunas.
        int matriz2[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        // Imprimindo matriz.
        System.out.println("Tamanho: " + matriz2.length);
        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Tamanho: " + matriz2[i].length);
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.println(matriz2[i][j]);
            }
        }
    }

}
