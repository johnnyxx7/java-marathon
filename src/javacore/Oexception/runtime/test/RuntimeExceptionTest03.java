package javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao();
    }

    public static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo.");
            System.out.println("Escrevendo dados no arquivo.");
            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recursos liberados pelo SO.");
        }
        return null;
    }

    public static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo.");
            System.out.println("Escrevendo dados no arquivo.");
        } finally {
            System.out.println("Fechando recursos liberados pelo SO.");
        }
    }
}
