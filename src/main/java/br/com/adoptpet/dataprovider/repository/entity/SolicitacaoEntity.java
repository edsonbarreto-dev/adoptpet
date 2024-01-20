package br.com.adoptpet.dataprovider.repository.entity;

import br.com.adoptpet.core.domain.shared.StatusSolicitacaoEnum;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "solicitacao")
public class SolicitacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @OneToOne
    @JoinColumn(name = "idPet")
    private PetEntity pet;
    @OneToOne
    @JoinColumn(name = "idSolicitante")
    private PessoaEntity solicitante;
    @OneToOne
    @JoinColumn(name = "idFuncionario")
    private PessoaEntity funcionario;
    private LocalDate dataSolicitacao = LocalDate.now();
    @Enumerated(EnumType.STRING)
    private StatusSolicitacaoEnum statusSolicitacao = StatusSolicitacaoEnum.EM_ANALISE;

    public SolicitacaoEntity(PetEntity pet, PessoaEntity solicitante, PessoaEntity funcionario, LocalDate dataSolicitacao) {
        this.pet = pet;
        this.solicitante = solicitante;
        this.funcionario = funcionario;
        this.dataSolicitacao = dataSolicitacao;
    }

    public SolicitacaoEntity(PetEntity pet, PessoaEntity solicitante,  LocalDate dataSolicitacao) {
        this.pet = pet;
        this.solicitante = solicitante;
         this.dataSolicitacao = dataSolicitacao;
    }

    public SolicitacaoEntity(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PetEntity getPet() {
        return pet;
    }

    public void setPet(PetEntity pet) {
        this.pet = pet;
    }

    public PessoaEntity getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(PessoaEntity solicitante) {
        this.solicitante = solicitante;
    }

    public PessoaEntity getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(PessoaEntity funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public StatusSolicitacaoEnum getStatusSolicitacao() {
        return statusSolicitacao;
    }

    public void setStatusSolicitacao(StatusSolicitacaoEnum statusSolicitacao) {
        this.statusSolicitacao = statusSolicitacao;
    }
}
