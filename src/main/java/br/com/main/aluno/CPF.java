package br.com.main.aluno;

public class CPF {
    private String cpf;

    public CPF(String cpf) {
        if(!validationCPF(cpf))
            throw new IllegalArgumentException("CPF invalid");

        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    private boolean validationCPF(String cpf){
        if(cpf == null) return false;

        return cpf.matches("\\d{3}(\\.)?\\d{3}(\\.)?\\d{3}(\\-)?\\d{2}");
    }
}
