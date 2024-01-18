package br.com.fiap.pettech.pettech.dataprovider.repository.entity;

import br.com.fiap.pettech.pettech.core.shared.TipoPessoa;
import jakarta.persistence.*;

@Entity
@Table(name="ong")
public class OngEntity extends PessoaEntity {

    private String cnpj;

    public OngEntity() {}

    public OngEntity(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    @Override
    public void setTipoPessoa() {
        tipoPessoa = TipoPessoa.JURIDICA;
    }

}

/*
* create table ong(
id serial primary key,
nome varchar(50),
cnpj varchar(13),
endereco bigint references endereco(id)
);
* */
