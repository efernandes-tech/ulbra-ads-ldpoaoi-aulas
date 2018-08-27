
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
public class HelloName {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Informe sua idade: ");

        int idade = teclado.nextInt();

        System.out.println("Você tem " + idade + " anos");
    }

}
