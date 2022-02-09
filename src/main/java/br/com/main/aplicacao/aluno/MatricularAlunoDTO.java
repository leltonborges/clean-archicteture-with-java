package br.com.main.aplicacao.aluno;

import br.com.main.dominio.aluno.Aluno;
import br.com.main.dominio.aluno.CPF;
import br.com.main.dominio.aluno.Email;

public class MatricularAlunoDTO {
    private String nome;
    private String cpf;
    private String email;

    public MatricularAlunoDTO(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public Aluno criarAluno() {
        return  new Aluno(new CPF(this.cpf), this.nome, new Email(this.email));
    }
}
