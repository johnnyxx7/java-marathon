package javacore.introducaometodosB.test;

import javacore.introducaometodosB.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1, 1, 1, 1, 1};

        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}