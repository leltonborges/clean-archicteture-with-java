package br.com.main.infra.indicacao;

import br.com.main.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.main.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno alunoIndicado) {
        // logica de envio de email com a lib
    }
}
