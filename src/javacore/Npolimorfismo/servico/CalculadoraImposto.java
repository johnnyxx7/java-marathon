package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("--- RELATÓRIO DE IMPOSTO DO COMPUTADOR ---");
        double imposto = computador.calcularImposto();
        System.out.println("Nome: " + computador.getNome());
        System.out.println("Valor: R$" + computador.getValor());
        System.out.println("Imposto a ser pago: R$" + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("--- RELATÓRIO DE IMPOSTO DO TOMATE ---");
        double imposto = tomate.calcularImposto();
        System.out.println("Nome: " + tomate.getNome());
        System.out.println("Valor: R$" + tomate.getValor());
        System.out.println("Imposto a ser pago: R$" + imposto);
    }
}
