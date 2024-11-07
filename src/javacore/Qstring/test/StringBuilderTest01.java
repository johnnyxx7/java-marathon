package javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "maysa gomes";
        nome.concat(" maravilhosa");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("maysa gomes");
        sb.append(" maravilhosa");
        System.out.println(sb);
    }
}
