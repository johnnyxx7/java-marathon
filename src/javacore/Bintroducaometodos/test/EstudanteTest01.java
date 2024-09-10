package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Light";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante02.nome = "Misa";
        estudante02.idade = 20;
        estudante02.sexo = 'F';


        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}