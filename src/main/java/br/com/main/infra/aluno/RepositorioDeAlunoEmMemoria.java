package br.com.main.infra.aluno;

import br.com.main.dominio.aluno.Aluno;
import br.com.main.dominio.aluno.CPF;
import br.com.main.dominio.aluno.RepositorioDeAlunos;
import br.com.main.dominio.aluno.exception.AlunoNaoEncontrado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RepositorioDeAlunoEmMemoria implements RepositorioDeAlunos {

    private final List<Aluno> alunos = new ArrayList<>();
    @Override
    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return alunos.stream()
                .filter(a -> a.getCpf().getCpf().equals(cpf.getCpf()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado("Aluno não encontrado"));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.alunos;
    }
}
