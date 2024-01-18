package br.com.fiap.pettech.pettech.entity;

import jakarta.persistence.*;

@Entity
@Table(name="ong")
public class Ong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cnpj;
   @OneToOne
    private Endereco endereco;
}

/*
* create table ong(
id serial primary key,
nome varchar(50),
cnpj varchar(13),
endereco bigint references endereco(id)
);
* */