package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Salário: R$" + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
