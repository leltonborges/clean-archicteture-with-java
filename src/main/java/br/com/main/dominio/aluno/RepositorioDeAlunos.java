package br.com.main.dominio.aluno;

import java.util.List;
import java.util.Optional;

public interface RepositorioDeAlunos {
    void matricular(Aluno aluno);

    Aluno buscarPorCPF(CPF cpf);
    List<Aluno> listarTodosAlunosMatriculados();
}
