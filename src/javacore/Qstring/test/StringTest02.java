package javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Maysa";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("s", "l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0, numeros.length()));
        System.out.println(nome.trim());
    }
}
