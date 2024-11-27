package javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "abc";
        String texto = "abc123abc";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:  " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("posições encontradas:");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
