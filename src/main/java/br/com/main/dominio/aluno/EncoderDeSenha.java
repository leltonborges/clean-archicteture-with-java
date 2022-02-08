package br.com.main.dominio.aluno;

public interface EncoderDeSenha {
    String encodarSenha(String senha);

    boolean validarSenhaEncodada(String senhaEncoder, String senha);
}
