package javacore.Gassociacao.exercicio;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Johnny", 18);
        Aluno aluno2 = new Aluno("Maysa", 16);
        Aluno aluno3 = new Aluno("Sofia", 14);
        Professor professor = new Professor("Amauri", "Matemática");

        Aluno[] alunos = {aluno1, aluno2, aluno3};
        Professor[] professores = {professor};

        Seminario seminario = new Seminario("Teorema de Pitágoras", "Av. São João", professores, alunos);

        seminario.imprime();
    }
}
