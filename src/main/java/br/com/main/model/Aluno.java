package br.com.main.model;

import java.util.HashSet;
import java.util.Set;

//Entity
public class Aluno {

    private CPF cpf;
    private String name;
    private Email email;
    private Set<Telefone> telefones = new HashSet<>();

    public void addTelefone(String ddd, String telefone){
        this.telefones.add(new Telefone(ddd, telefone));
    }

    public void addTelefone(Telefone telefone){
        this.telefones.add(telefone);
    }


}
