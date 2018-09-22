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
        
        Aluno aluno1;
        
        aluno1 = new Aluno();
        
        System.out.println("Id obj aluno1 = " + aluno1);
        
        Aluno aluno2 = new Aluno();
        
        System.out.println("Id obj aluno2 = " + aluno2);
        
        int idadeAluno1, idadeAluno2;
        idadeAluno1 = aluno1.calculaIdade();
        idadeAluno2 = aluno1.calculaIdade();
        
        // aluno1.nome = "Tales";
        aluno1.setNome("Tales");
                
        // aluno1.nome = aluno2.nome;
        // aluno1.cgu = aluno2.cgu;
        
        aluno1 = aluno2;

        System.out.println("Id obj aluno1 = " + aluno1);
        
    }
    
}
