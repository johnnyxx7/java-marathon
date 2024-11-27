package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d -> todos os digitos do texto
        // \D -> tudo o que não for dígito
        // \s -> todos os espaços em branco (\t \n \f \r)
        // \S -> todos os caractéres com exceção do branco
        // \w -> de a-z, todos os dígitos, _
        // \W -> tudo o que não estiver incluso no \w
        // []

        String regex = "\\w";
        String texto = "@dsk12dfd_ ";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("regex: " + regex);
        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start() + " -> " + matcher.group() + " " + "\n");
        }
    }
}
