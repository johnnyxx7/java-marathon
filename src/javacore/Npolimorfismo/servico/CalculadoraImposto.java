package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("--- RELATÓRIO DE IMPOSTO ---");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getValor());
        System.out.println("Imposto a ser pago: R$" + imposto);
        if (produto instanceof Tomate) {
            produto = (Tomate) produto;
            System.out.println("Data de validade: " + ((Tomate) produto).getDataValidade());
        }
    }
}
