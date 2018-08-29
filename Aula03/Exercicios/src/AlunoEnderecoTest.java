/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ederson.fernandes
 */
public class AlunoEnderecoTest {

    public static void main(String[] args) {

        Endereco er1 = new Endereco();
        er1.setRua("Rua A");
        er1.setNumero("123");
        er1.setComplemento("Ap. 12");
        er1.setBairro("Centro");
        er1.setCep("00000-000");
        er1.setCidade("Canoas");

        Endereco ec1 = new Endereco();
        ec1.setRua("Rua B");
        ec1.setNumero("321");
        ec1.setComplemento("Sala 12");
        ec1.setBairro("Sao Jose");
        ec1.setCep("00000-000");
        ec1.setCidade("Canoas");

        Aluno a1 = new Aluno();
        a1.setNome("Joao Silva");
        a1.setEnderecoResidencial(er1);
        a1.setEnderecoComercial(ec1);
        a1.setMatricula("123456789");

        System.out.println(a1.toString());

        Endereco er2 = new Endereco();
        er2.setRua("Rua C");
        er2.setNumero("456");
        er2.setComplemento("Casa Azul");
        er2.setBairro("Sao Lucas");
        er2.setCep("00000-000");
        er2.setCidade("Sao Leopoldo");

        Endereco ec2 = new Endereco();
        ec2.setRua("Rua D");
        ec2.setNumero("654");
        ec2.setComplemento("Terreo");
        ec2.setBairro("Centro");
        ec2.setCep("00000-000");
        ec2.setCidade("Esteio");

        Aluno a2 = new Aluno();
        a2.setNome("Pedro Souza");
        a2.setEnderecoResidencial(er2);
        a2.setEnderecoComercial(ec2);
        a2.setMatricula("987654321");

        System.out.println(a2.toString());

        Endereco er3 = new Endereco();
        er3.setRua("Rua E");
        er3.setNumero("789");
        er3.setComplemento("Fundos");
        er3.setBairro("Sao Pedro");
        er3.setCep("00000-000");
        er3.setCidade("Novo Hamburgo");

        Endereco ec3 = new Endereco();
        ec3.setRua("Rua F");
        ec3.setNumero("987");
        ec3.setComplemento("Ap. 27");
        ec3.setBairro("Centro");
        ec3.setCep("00000-000");
        ec3.setCidade("Sapucaia");

        Aluno a3 = new Aluno();
        a3.setNome("Silva Souza");
        a3.setEnderecoResidencial(er3);
        a3.setEnderecoComercial(ec3);
        a3.setMatricula("147852369");

        System.out.println(a3.toString());

    }

}
