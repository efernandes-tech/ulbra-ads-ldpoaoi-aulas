
import java.util.Scanner;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class CarroTest {

    public static void main(String args[]) {
    
        Scanner t = new Scanner(System.in);

        String cor = "";
        double capacidade = 0.0;

        System.out.println("Cor: ");
        cor = t.nextLine();

        System.out.println("Capacidade: ");
        capacidade = t.nextDouble();

        //System.out.println(cor + " | " + capacidade);

        Carro c = new Carro(cor, capacidade);

        int op = 0, vel = 0;
        do {
            System.out.println("1 - Aumentar a Velocidade");
            System.out.println("2 - Diminuir a Velocidade");
            System.out.println("0 - Sair");
            op = t.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Velocidade: ");
                    vel = t.nextInt();
                    c.aumentarVelocidade(vel);
                    System.out.println(c.mostraDados());
                    break;
                case 2:
                    System.out.println("Velocidade: ");
                    vel = t.nextInt();
                    c.reduzirVelocidade(vel);
                    System.out.println(c.mostraDados());
                    break;
                default:
                    System.out.println("Sair");
                    break;
            }
        } while (op != 0);

    }
    
}
