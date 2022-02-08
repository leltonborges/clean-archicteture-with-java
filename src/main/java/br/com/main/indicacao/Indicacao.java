package br.com.main.indicacao;

import br.com.main.aluno.Aluno;

import java.time.LocalDateTime;

public class Indicacao {
    private Aluno indicante;
    private Aluno indicado;
    private LocalDateTime dateIndicacao;

    public Indicacao(Aluno indicante, Aluno indicado) {
        this.indicante = indicante;
        this.indicado = indicado;
        this.dateIndicacao = LocalDateTime.now();
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public Aluno getIndicado() {
        return indicado;
    }

    public LocalDateTime getDateIndicacao() {
        return dateIndicacao;
    }
}
