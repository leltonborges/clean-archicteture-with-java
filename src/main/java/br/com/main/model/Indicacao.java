package br.com.main.model;

public class Indicacao {
    private Aluno indicante;
    private Aluno indicado;

    public Indicacao(Aluno indicante, Aluno indicado) {
        this.indicante = indicante;
        this.indicado = indicado;
    }

    public Aluno getIndicante() {
        return indicante;
    }

    public Aluno getIndicado() {
        return indicado;
    }
}
