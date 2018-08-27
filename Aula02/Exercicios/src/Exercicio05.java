
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
public class Exercicio05 {
   
    public static void main(String[] args) {
        
        int num = 1, soma = 0, cont = 0;
        
        while (cont < 10) {
            for (int i = 0; soma + i <= num; i++) {            
                if (i % 2 == 1) {
                    soma += i;

                }
            }

            if (num == soma) {
                System.out.println(num);
                cont++;
            }    
            
            num++;
            soma = 0;
        }
        
        // System.out.println(num + " / " + soma + " / " + cont);
        
    }
    
}
