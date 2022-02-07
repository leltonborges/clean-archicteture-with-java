package br.com.main.model;

public class CPF {
    private String value;

    public CPF(String value) {
        if(!validationCPF(value))
            throw new IllegalArgumentException("CPF invalid");

        this.value = value;
    }

    private boolean validationCPF(String cpf){
        if(cpf == null) return false;

        return cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}");
    }
}
