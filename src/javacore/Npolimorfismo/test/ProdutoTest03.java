package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        Tomate tomate = new Tomate("Tomate Americano", 20);
        tomate.setDataValidade("02/12/2024");

        CalculadoraImposto.calcularImposto(produto);
        CalculadoraImposto.calcularImposto(tomate);
    }
}
