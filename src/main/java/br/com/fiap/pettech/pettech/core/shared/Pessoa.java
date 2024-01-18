package br.com.fiap.pettech.pettech.core.shared;

public abstract class Pessoa {

    protected Long id;
    public String nome;
    public String telefone;
    public String email;
    public Endereco endereco;
    public TipoPessoa tipoPessoa;

    public Pessoa(Long id, String nome, String telefone, String email, Endereco endereco, TipoPessoa tipoPessoa) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.tipoPessoa = tipoPessoa;
    }

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

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
