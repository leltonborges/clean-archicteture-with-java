package br.com.main.aplicacao.indicacao;

import br.com.main.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
    void enviarPara(Aluno alunoIndicado);
}
