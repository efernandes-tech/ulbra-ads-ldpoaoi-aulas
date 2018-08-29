
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
public class EmpregadoTest {

    public static void main(String[] args) {

        Empregado emp = new Empregado();
                
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Nome do Empregado: ");
        emp.setNome(teclado.nextLine());
        
        System.out.print("\nSalario: ");
        emp.setSalario(teclado.nextDouble());
        
        System.out.print("\nPercentual de Aumento: ");
        emp.aumentaSalario(teclado.nextDouble());
        
        System.out.print("\nNovo Salario: " + emp.getSalario());
        
    }
    
}
