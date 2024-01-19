package br.com.adoptpet.core.domain.solicitacao;

import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.StatusSolicitacaoEnum;

import java.time.LocalDate;

public class Solicitacao {
    private Long numeroSolicitacao;
    private Pet pet;
    private Pessoa solicitante;
    private Pessoa funcionario;
    private LocalDate dataSolicitacao = LocalDate.now();
    private StatusSolicitacaoEnum statusSolicitacao = StatusSolicitacaoEnum.EM_ANALISE;

    public Solicitacao(Pet pet, Pessoa solicitante, Pessoa funcionario, LocalDate dataSolicitacao) {
        this.pet = pet;
        this.solicitante = solicitante;
        this.funcionario = funcionario;
        this.dataSolicitacao = dataSolicitacao;
    }

    public Solicitacao(Pet pet, Pessoa solicitante, LocalDate dataSolicitacao) {
        this.pet = pet;
        this.solicitante = solicitante;
        this.dataSolicitacao = dataSolicitacao;
    }

    public Long getNumeroSolicitacao() {
        return numeroSolicitacao;
    }

    public void setNumeroSolicitacao(Long numeroSolicitacao) {
        this.numeroSolicitacao = numeroSolicitacao;
    }
}
