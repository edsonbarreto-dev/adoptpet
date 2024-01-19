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
}
