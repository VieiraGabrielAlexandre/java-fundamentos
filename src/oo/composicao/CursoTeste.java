package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");

        Curso curso1 = new Curso("Matemática");
        Curso curso2 = new Curso("História");

        aluno1.adicionarCurso(curso1);
        aluno1.adicionarCurso(curso2);
        aluno2.adicionarCurso(curso1);

        System.out.println("Alunos do curso de Matemática:");
        for (Aluno aluno : curso1.alunos) {
            System.out.println(aluno.nome);
        }

        System.out.println("\nCursos do João:");
        for (Curso curso : aluno1.cursos) {
            System.out.println(curso.nome);
        }

        System.out.println("\nCursos do Maria:");
        for (Curso curso : aluno2.cursos) {
            System.out.println(curso.nome);
        }

        System.out.println("\nAlunos do curso de História:");

        for (Aluno aluno : curso2.alunos) {
            System.out.println(aluno.nome);
        }

        System.out.println("\nDetalhes do aluno João:");
        System.out.println(aluno1);
    }
}
