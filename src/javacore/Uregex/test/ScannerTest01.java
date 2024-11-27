package javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Johnny, Maysa, Sofia, true, 200";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while (scanner.hasNext()) {
            System.out.println(scanner.next().trim());
        }
    }
}
