package br.com.main.aluno;

import java.util.HashSet;
import java.util.Set;

//Entity
public class Aluno {

    private CPF cpf;
    private String name;
    private Email email;
    private Set<Telefone> telefones = new HashSet<>();

    public Aluno(CPF cpf, String name, Email email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public void addTelefone(String ddd, String telefone){
        this.telefones.add(new Telefone(ddd, telefone));
    }

    public void addTelefone(Telefone telefone){
        this.telefones.add(telefone);
    }


}
