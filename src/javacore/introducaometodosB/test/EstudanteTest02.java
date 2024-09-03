package javacore.introducaometodosB.test;

import javacore.introducaometodosB.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Johnny";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Maysa";
        estudante02.idade = 15;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
