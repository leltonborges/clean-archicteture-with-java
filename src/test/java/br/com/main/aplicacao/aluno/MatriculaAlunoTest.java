package br.com.main.aplicacao.aluno;

import br.com.main.dominio.aluno.Aluno;
import br.com.main.dominio.aluno.CPF;
import br.com.main.infra.aluno.RepositorioDeAlunoEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriculaAlunoTest {
    @Test
    void testAlunoDeveriaSerPersistido() {
        RepositorioDeAlunoEmMemoria repositorio = new RepositorioDeAlunoEmMemoria();
        MatriculaAluno useCase = new MatriculaAluno(repositorio);

        String name = "Foo Bar";
        String cpf = "011.521.254-09";
        String email = "foo@bar.com";

        useCase.executa(new MatricularAlunoDTO(name, cpf, email));
        Aluno aluno = repositorio.buscarPorCPF(new CPF(cpf));
        assertEquals(cpf, aluno.getCpf().getCpf());
        assertEquals(name, aluno.getName());
        assertEquals(email, aluno.getEmail().getAddressEmail());
    }
}