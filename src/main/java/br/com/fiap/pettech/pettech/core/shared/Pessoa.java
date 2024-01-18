package br.com.fiap.pettech.pettech.core.shared;

public abstract class Pessoa {

    public String nome;
    public String telefone;
    public String email;
    public Endereco endereco;
    public TipoPessoa tipoPessoa;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {}

    public abstract void setTipoPessoa();

    public TipoPessoa getTipoPessoa() {
        return this.tipoPessoa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
