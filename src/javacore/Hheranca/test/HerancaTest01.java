package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua Vinte e Um");
        endereco.setCep("12345-987");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Johnny");
        pessoa.setCpf("000.111.222-33");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maysa");
        funcionario.setCpf("111.222.333-44");
        endereco.setRua("Rua Vinte e Dois");
        endereco.setCep("54321-23");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
