/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class CursoProfessorTest {

    public static void main(String[] args) {
        
        Professor prof1 = new Professor();
        prof1.setNumero(123);
        prof1.setNome("Pedro");
        
        Professor prof2 = new Professor();
        prof2.setNumero(321);
        prof2.setNome("Joao");
        
        Curso c1 = new Curso();
        c1.setNumero(456);
        c1.setNome("Curso A");
        c1.setProfessor(prof1);
        
        Curso c2 = new Curso();
        c2.setNumero(654);
        c2.setNome("Curso B");
        c2.setProfessor(prof2);
        
        Curso c3 = new Curso();
        c3.setNumero(546);
        c3.setNome("Curso C");
        c3.setProfessor(prof1);
        
        System.out.println(c1.exibeDados());
        System.out.println(c2.exibeDados());
        System.out.println(c3.exibeDados());
            
    }
    
}
