package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double result = calculadora.divideDoisNumeros(20, 2);
        System.out.println(result);

        System.out.println(calculadora.divideDoisNumeros02(20, 2));

        calculadora.imprimeDivisaoDeDoisNumeros(30, 0);

    }
}