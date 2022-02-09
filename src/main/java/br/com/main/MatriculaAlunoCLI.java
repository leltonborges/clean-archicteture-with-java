package br.com.main;

import br.com.main.aplicacao.aluno.MatriculaAluno;
import br.com.main.aplicacao.aluno.MatricularAlunoDTO;
import br.com.main.infra.aluno.RepositorioDeAlunoEmMemoria;

public class MatriculaAlunoCLI {
    public static void main(String[] args) {
        String name = "Foo Bar";
        String cpf = "011.521.254-09";
        String email = "foo@bar.com";

        MatriculaAluno matricular = new MatriculaAluno(new RepositorioDeAlunoEmMemoria());
        matricular.executa(new MatricularAlunoDTO(name, cpf, email));
    }
}
