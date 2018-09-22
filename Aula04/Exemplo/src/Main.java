/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class Main {

    public static void main(String[] args) {
        
        int idadeAluno;
        Aluno aluno1=new Aluno("Tales", 123, "06/09");
        idadeAluno = aluno1.calculaIdade();
        System.out.println("Idade do aluno:"+ idadeAluno);

    }
    
}
