
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Exercicio07 {

    public static void main(String[] args) {
        
        int x, y;
                
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        x = teclado.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        y = teclado.nextInt();
        
        if (x == y) {
            System.out.println("Numeros iguais");
        } else if (x > y) {
            System.out.println("Primeiro numero maior");
        } else {
            System.out.println("Segundo numero maior");
        }
        
    }
    
}
