package javacore.introducaometodosB.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(Funcionario funcionario) {
        System.out.println("-------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios == null) {
            return;
        }
            for (double salario : salarios) {
                System.out.println("Salário: R$" + salario);

        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        if (salarios == null) {
            return;
        }

        double media = 0;

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salárial: R$" + media);
    }
}