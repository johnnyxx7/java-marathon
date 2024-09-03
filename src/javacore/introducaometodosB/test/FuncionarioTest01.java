package javacore.introducaometodosB.test;

import javacore.introducaometodosB.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Johnny";
        funcionario.idade = 18;
        funcionario.salarios = new double[]{3512, 456, 900};

        funcionario.imprime(funcionario);
    }
}
