package br.com.fiap.pettech.pettech.dataprovider.repository.entity;

import br.com.fiap.pettech.pettech.core.shared.TipoPessoa;
import jakarta.persistence.*;

@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long id;
    public String nome;
    public String telefone;
    public String email;
    @ManyToOne
    @JoinColumn(name = "endereco")
    public Endereco endereco;
    public TipoPessoa tipoPessoa;

    public PessoaEntity(String nome) {
        this.nome = nome;
    }

    public PessoaEntity() {}

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

}
