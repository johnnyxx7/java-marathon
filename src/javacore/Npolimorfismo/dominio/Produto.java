package javacore.Npolimorfismo.dominio;

public abstract class Produto implements Taxavel {
    protected String nome;
    protected double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void imprime() {
        System.out.println("------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("Valor: R$" + getValor());
        System.out.println("Imposto a ser pago: R$" + calcularImposto());
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}
