
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
public class Exercicio04 {
    
    public static void main(String[] args) {
        
        int larg, alt;
                
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a altura do quadrilatero: ");
        larg = teclado.nextInt();
        
        System.out.println("Digite a largura do quadrilatero: ");
        alt = teclado.nextInt();
        
        for (int i = 0; i < larg; i++) {
            for (int j = 0; j < alt; j++) {
                System.out.print("X");
            }
            System.out.print("\n");
        }
        
    }
    
}
