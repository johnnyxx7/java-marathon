package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor  = new Professor("Satoru");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor, professor2};
        Escola escola =  new Escola("Jujutsu", professores);

        escola.imprime();
    }
}
