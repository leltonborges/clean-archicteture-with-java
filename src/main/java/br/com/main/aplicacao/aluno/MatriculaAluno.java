package br.com.main.aplicacao.aluno;

import br.com.main.dominio.aluno.Aluno;
import br.com.main.dominio.aluno.RepositorioDeAlunos;

public class MatriculaAluno {
    private final RepositorioDeAlunos repositorioDeAlunos;

    public MatriculaAluno(RepositorioDeAlunos repositorioDeAlunos) {
        this.repositorioDeAlunos = repositorioDeAlunos;
    }

    public void executa(MatricularAlunoDTO dados){
        Aluno aluno = dados.criarAluno();
        repositorioDeAlunos.matricular(aluno);
    }
}
