package br.com.adoptpet.dataprovider.repository.vo;

import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.StatusSolicitacaoEnum;
import lombok.Data;

import java.time.LocalDate;

@Data
public class SolicitacaoVO {
    private Long numeroSolicitacao;
    private Pet pet;
    private Pessoa solicitante;
    private Pessoa funcionario;
    private LocalDate dataSolicitacao;
    private StatusSolicitacaoEnum statusSolicitacao;
}
