package br.com.main.aluno;

// Value Object
public class Email {

    private String addressEmail;

    public Email(String addressEmail) {
        if (addressEmail == null || !validationEmail(addressEmail)){
            throw new IllegalArgumentException("Email invalido");
        }

        this.addressEmail = addressEmail;
    }

    private boolean validationEmail(String addressEmail){
        return addressEmail.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z0-9]{2,}$");
    }

    public String getAddressEmail() {
        return addressEmail;
    }
}
