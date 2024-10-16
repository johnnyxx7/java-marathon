package introduction;

public class Aula03TiposPrimitivosExercicio {
    /*
     Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
     Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
     */

    public static void main (String[] args) {
        String nome = "Johnny";
        String endereco = "Av. São João";
        double salario = 3512;
        String dataRecebimentoSalario = "02/09/2024";
        String report = "Eu, " + nome + " morando no endereço: " + endereco + ", confirmo que recebi o salário de R$" +
                salario + ", na data " + dataRecebimentoSalario;

        System.out.println(report);
    }
}
