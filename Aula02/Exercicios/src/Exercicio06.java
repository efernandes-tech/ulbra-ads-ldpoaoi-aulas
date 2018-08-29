
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
public class Exercicio06 {
    
    public static void main(String[] args) {
        
        int num, soma = 0;
                
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro positivo: ");
        num = teclado.nextInt();
        
        if (num <= 0) {
            System.out.println("Numero Invalido");
        } else {
            for (int i = 0; i <= num; i++) {
                if (i % 2 == 1) {
                    soma += i;
                }
            }
            System.out.println(soma);
        }
    }
    
}