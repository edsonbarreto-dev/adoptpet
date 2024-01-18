package br.com.fiap.pettech.pettech.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "familia")
public class Familia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeResponsavel;
    private String cpf;
    private String telefone;
    private String email;
    @OneToOne
    private Endereco endereco;

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