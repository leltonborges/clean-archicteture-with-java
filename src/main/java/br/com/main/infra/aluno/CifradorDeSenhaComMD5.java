package br.com.main.infra.aluno;

import br.com.main.dominio.aluno.EncoderDeSenha;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CifradorDeSenhaComMD5 implements EncoderDeSenha {

    @Override
    public String encodarSenha(String senha) {
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(senha.getBytes());
            byte[] bytes = md5.digest();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < bytes.length; i++){
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(2));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("erro ao gerar o hash da senha");
        }
    }

    @Override
    public boolean validarSenhaEncodada(String senhaEncoder, String senha) {
        return senhaEncoder.equals(encodarSenha(senha));
    }
}
