package br.com.fiap.pettech.pettech.dataprovider.repository.entity;

import br.com.fiap.pettech.pettech.core.shared.SexoPetEnum;
import br.com.fiap.pettech.pettech.core.shared.StatusPetEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "pet")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PetEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected Long id;

    protected String nome;
    protected String raca;
    protected String porte;
    protected String corDoPelo = "Não informado";
    protected String corDosOlhos = "Não informado";
    @Enumerated(EnumType.STRING)
    protected SexoPetEnum sexo;
    protected int idade;
    protected int expectativaDeVida;
    protected double peso;
    protected double altura;
    @Enumerated(EnumType.STRING)
    protected StatusPetEnum status;

    //Criar duas tabelas uma para gato e uma para cachorro ou na tabela podemos criar um campo tipoPet (gato, cachorro)?


    public PetEntity(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public PetEntity() {}

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
