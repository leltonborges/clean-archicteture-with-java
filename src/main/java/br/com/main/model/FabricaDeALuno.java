package br.com.main.model;

import java.util.Set;

public class FabricaDeALuno {
    private String name;
    private CPF cpf;
    private Email email;
    private Set<Telefone> telefones;

   public FabricaDeALuno comNome(String name){
       this.name = name;
       return this;
   }

   public FabricaDeALuno comEmail(String email){
       this.email = new Email(email);
       return  this;
   }

   public FabricaDeALuno comCpf(String cpf){
       this.cpf = new CPF(cpf);
       return this;
   }

   public FabricaDeALuno comTelefone(String ddd, String numero){
       this.telefones.add(new Telefone(ddd, numero));
       return this;
   }

   public FabricaDeALuno comTelefone(Telefone telefone){
       this.telefones.add(telefone);
       return this;
   }

   public Aluno criarAluno(){
       Aluno aluno = new Aluno(cpf,name, email);
       this.telefones.forEach(t -> aluno.addTelefone(t));
       return aluno;
   }

}
