
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 122535010
 */
public class Exercicio02 {
    
    public static void main(String[] args) {
        
        int x, y;
        int soma, sub, multi;
        double div;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        x = teclado.nextInt();
        
        System.out.println("Digite o segundo número: ");
        y = teclado.nextInt();
        
        soma = x + y;
        
        System.out.println("Soma: " + soma);
        
        sub = x - y;
        
        System.out.println("Subtração: " + sub);
        
        multi = x * y;
        
        System.out.println("Multiplicação: " + multi);
        
        if (y == 0) {
            System.out.println("Impossível dividir por zero!");
        } else {
            div = (double) x / y;
        
            System.out.println("Divisão: " + div);
        }
        
    }
    
}
