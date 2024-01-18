package br.com.fiap.pettech.pettech.entity;

import br.com.fiap.pettech.pettech.core.shared.SexoPetEnum;
import br.com.fiap.pettech.pettech.core.shared.StatusPetEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String raca;
    private String porte;
    private String cor;
    @Enumerated(EnumType.STRING)
    private SexoPetEnum sexo;
    private int idade;
    @Enumerated(EnumType.STRING)
    private StatusPetEnum status;

}

/*
* create table pet(
id serial primary key,
nome varchar(50),
raca varchar(30),
porte varchar(30),
cor varchar(15),
sexo varchar(5),
idade numeric(3),
status varchar(20)
);
* */
