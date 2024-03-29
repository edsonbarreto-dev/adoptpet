package br.com.adoptpet.dataprovider.repository.entity;

import jakarta.persistence.*;
/*
* create table endereco(
id serial primary key,
endereco varchar(100),
cep varchar(8),
cidade varchar(50),
estado varchar(2),
bairro varchar(30),
numero varchar(10)
);
* */
@Entity
@Table(name = "endereco")
public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String endereco;
    private String cep;
    private String cidade;
    private String estado;
    private String bairro;
    private String numero;
}
