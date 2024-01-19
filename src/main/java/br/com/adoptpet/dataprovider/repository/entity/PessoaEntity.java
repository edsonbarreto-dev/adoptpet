package br.com.adoptpet.dataprovider.repository.entity;

import br.com.adoptpet.core.domain.shared.TipoPessoa;
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
    public EnderecoEntity endereco;
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

    public EnderecoEntity getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoEntity endereco) {
        this.endereco = endereco;
    }

}
