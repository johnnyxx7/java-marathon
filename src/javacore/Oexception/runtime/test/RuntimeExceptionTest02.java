package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(10, 2));
    }

    /**
     *
     * @param a
     * @param b divisor não pode ser 0.
     * @return
     * @throws IllegalArgumentException caso parametro b seja 0.
     */

    public static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser dividido por zero.");
        }
        return a/b;
    }
}
