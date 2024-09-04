package javacore.introducaometodosB.test;

import javacore.introducaometodosB.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Johnny");
        funcionario.setIdade(18);
        funcionario.setSalarios(new double[]{3512, 456, 900});

        funcionario.imprime(funcionario);
    }
}