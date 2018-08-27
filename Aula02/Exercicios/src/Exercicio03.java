
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
public class Exercicio03 {
    
    public static void main(String[] args) {
        
        int x, y, soma;
                
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Número do primeiro usuário: ");
        x = teclado.nextInt();
        
        System.out.println("Número do segundo usuário: ");
        y = teclado.nextInt();
        
        soma = x + y;
        
        if (soma % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
        
    }
    
}
