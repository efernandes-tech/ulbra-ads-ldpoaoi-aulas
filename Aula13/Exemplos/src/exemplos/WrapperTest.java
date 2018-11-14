/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplos;

/**
 *
 * @author ederson.fernandes
 */
public class WrapperTest {

    public static void main(String[] args) {
        // Criando um objeto Integer a partir de um int.
        int i1 = 1;
        Integer objInt1 = new Integer(i1);
        // Ou simplesmente:
        Integer objInt2 = 1;

        // Criando um int a partir de um objeto Integer.
        int i2 = objInt1.intValue();
        // Ou simplesmente:
        int i3 = objInt2;
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(10);

        // Testando valores.
        if (num1.equals(num2)) {
            System.out.println("Valores sao iguais !");
        } else {
            System.out.println("Valores sao diferentes !");
        }

        // Testando referencias.
        if (num1 == num2) {
            System.out.println("As referencias sao iguais !");
        } else {
            System.out.println("As referencias sao diferentes !");
        }

        // Funcoes uteis:
        // Integer.parseInt(String)
        // Integer.toOctalString(int)
        // Float.parseFloat(String)
        // Float.toHexString(Float)
        // Boolean.getBoolean(String)
        // Double.parseDouble(String)
    }
}
