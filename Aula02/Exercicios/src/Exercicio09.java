
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
public class Exercicio09 {

    public static void main(String[] args) {
        
        int resultado = 0;
        String escolha;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Telefonou para a vítima?");        
        System.out.println("Digite Sim ou Nao");
        escolha = teclado.nextLine().replace("\n", "").replace("\r", "");
        resultado += ("Sim".equals(escolha) ? 1 : 0);
        
        System.out.println("Esteve no local do crime?");        
        System.out.println("Digite Sim ou Nao");
        escolha = teclado.nextLine().replace("\n", "").replace("\r", "");
        resultado += ("Sim".equals(escolha) ? 1 : 0);
        
        System.out.println("Mora perto da vítima?");        
        System.out.println("Digite Sim ou Nao");
        escolha = teclado.nextLine().replace("\n", "").replace("\r", "");
        resultado += ("Sim".equals(escolha) ? 1 : 0);
        
        System.out.println("Devia para a vítima?");        
        System.out.println("Digite Sim ou Nao");
        escolha = teclado.nextLine().replace("\n", "").replace("\r", "");
        resultado += ("Sim".equals(escolha) ? 1 : 0);
        
        System.out.println("Já trabalhou com a vítima?");        
        System.out.println("Digite Sim ou Nao");
        escolha = teclado.nextLine().replace("\n", "").replace("\r", "");
        resultado += ("Sim".equals(escolha) ? 1 : 0);
        
        switch (resultado) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
                break;
        }
        
    }
    
}
