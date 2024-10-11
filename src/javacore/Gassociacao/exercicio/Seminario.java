package javacore.Gassociacao.exercicio;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Seminario {
    private String titulo;
    private String local;
    private Professor[] professores;
    private Aluno[] alunos;

    public Seminario(String titulo, String local, Professor[] professores) {
        this.titulo = titulo;
        this.local = local;
        this.professores = professores;
    }

    public Seminario(String titulo, String local, Professor[] professores, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.professores = professores;
        this.alunos = alunos;
    }

    public void imprime() {
        System.out.println("--- SEMINÁRIO ---");
        System.out.println("Título do seminário: " + this.titulo);
        System.out.println("Local: " + this.local);
        System.out.println("--- PROFESSOR ---");
        for (Professor professor : professores) {
            System.out.println("Professor: " + professor.getNome());
        }
        if (alunos == null) return;
        System.out.println("--- ALUNOS ---");
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
