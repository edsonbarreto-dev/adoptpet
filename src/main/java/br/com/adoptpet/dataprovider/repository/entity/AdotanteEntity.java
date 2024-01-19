package br.com.adoptpet.dataprovider.repository.entity;

import br.com.adoptpet.core.domain.shared.TipoPessoa;
import jakarta.persistence.*;

@Entity
@Table(name = "adotante")
public class AdotanteEntity extends PessoaEntity {
    private String genero;
    private int idade;

    public AdotanteEntity(String nome, String genero, int idade) {
        super(nome);
        this.genero = genero;
        this.idade = idade;
    }

    public AdotanteEntity() {
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void setTipoPessoa() {
        this.tipoPessoa = TipoPessoa.FISICA;
    }
}
/*
* create table familia(
id serial primary key,
nomeResponsavel varchar(50),
cpf varchar(11),
telefone varchar(13),
email varchar(40),
endereco bigint references endereco(id)
);
* */
