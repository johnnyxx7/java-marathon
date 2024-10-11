package javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- O GRANDE SOFTWARE DE PREVISÃO DO FUTURO ---");
        System.out.print("Digite sua pergunta e eu responderei 'SIM' ou 'NÃO': ");
        String pergunta = scanner.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
