package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Time time = new Time("Real Madrid");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
