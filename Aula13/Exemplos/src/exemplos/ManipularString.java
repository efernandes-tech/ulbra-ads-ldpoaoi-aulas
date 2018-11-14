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
public class ManipularString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // String Literais - Exemplos
        // Define um literal para uma variável String.
        String nome = "Tales";
        // Executando um método.
        char primeiro = "Tales".charAt(0);
        // Executando um método na variável.
        char segundo = nome.charAt(0);
        
        // Imutabilidade.
        String word1 = "Java";
        String word2 = word1;
        
        // String vazia.
        String word3 = "";
        String word4 = new String();
        
        // Construtores para cópia.
        String word5 = new String("Java");
        String word6 = new String(word5);
        
        // Outros construtores.
        char[] palavra1 = {'J', 'a', 'v', 'a'};
        String word7 = new String(palavra1); // Java
        String word8 = "Java";
        char[] palavra2 = word8.toCharArray(); // {'J', 'a', 'v', 'a'}
        
        // Outros métodos.
        "Trabalho".length();
        "Ulbra".charAt(2);
        
        // Método substring.
        int i=0, j=2;
        String subs = word1.substring(i, j);
        
        // Concatenação.
        String word9 = "re", word10 = "think", word11 = "ing";
        int num = 2;
        String result1 = word9 + word10;
        String result2 = word1.concat(word10);
        result2 += word11;
        result2 += num;
        
        // Pesquisa.
        String name ="President George Washington";
        name.indexOf ('P');
        name.indexOf ('e');
        name.indexOf ("George");
        name.indexOf ('e', 3);
        name.indexOf ("Bob");
        name.lastIndexOf ('e');
        
        // Igualdade.
        boolean b = word1.equals(word2);
        b = word1.equalsIgnoreCase(word2);
        b = "Gremio".equals("Gremio"); // true
        b = "Gremio".equals("gremio"); // false
        b = "Gremio".equalsIgnoreCase("gremio"); // true
        
        // Método "trim".
        String word12 = " Oi Bob ";
        String word13 = word1.trim();
        
        // Método "replace".
        String word14 = "raro";
        String word15 = "raro".replace('r', 'd');
        
        // Mudando "case".
        String word16 = "HeLLo";
        String word17 = word1.toUpperCase(); // "HELLO"
        String word18 = word1.toLowerCase(); // "hello"
        
        // Número em Strings.
        String s = "" + num;
        s = Integer.toString(123); // "123"
        s = Double.toString(3.14); // "3.14"
    }

}
