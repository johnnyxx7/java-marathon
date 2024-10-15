package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco de inicialização estático de funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de funcionário 2");
    }

    public Funcionario(String nome) {
        super(nome);
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário: R$" + this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu, " + this.nome + " recebi o salário de R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
