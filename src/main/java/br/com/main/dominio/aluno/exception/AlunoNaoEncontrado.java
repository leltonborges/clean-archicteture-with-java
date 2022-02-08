package br.com.main.dominio.aluno.exception;

public class AlunoNaoEncontrado extends RuntimeException {
    public AlunoNaoEncontrado(String message) {
        super(message);
    }

    public AlunoNaoEncontrado(String message, Throwable cause) {
        super(message, cause);
    }
}
