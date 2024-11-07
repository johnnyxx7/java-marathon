package javacore.Qstring.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String = " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder = " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer = " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i; // 0, 01, 012, 013
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sbf = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sbf.append(i);
        }
    }
}
