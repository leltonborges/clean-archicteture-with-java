package br.com.main.model;

public class Telefone {
    private String ddd;
    private String number;

    public Telefone(String ddd, String number) {
        validDDD(ddd);
        validNumber(number);
        this.ddd = ddd;
        this.number = number;
    }

    private void validDDD(String ddd){
        if(ddd == null) throw new NullPointerException("DDD is not null");
        if(!ddd.matches("\\d{2}")) throw new IllegalArgumentException("DDD invalid");
    }

    private void validNumber(String number){
        if(ddd == null) throw new NullPointerException("Phone number is not null");
        if(ddd.matches("\\d{4,5}(\\-)?\\d{4}")) throw new IllegalArgumentException("Phone number invalid");
    }
}
