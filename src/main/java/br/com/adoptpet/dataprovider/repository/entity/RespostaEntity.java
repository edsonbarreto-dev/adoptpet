package br.com.adoptpet.dataprovider.repository.entity;

import br.com.adoptpet.core.domain.shared.StatusSolicitacaoEnum;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="RespostaSolicitacao")
public class RespostaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private SolicitacaoAdocaoEntity solicitacao;
    @Enumerated(EnumType.STRING)
    private StatusSolicitacaoEnum resposta = StatusSolicitacaoEnum.EM_ANALISE;
    private LocalDate dataResposta = LocalDate.now();
    private String observacao;

    public RespostaEntity(SolicitacaoAdocaoEntity solicitacao, StatusSolicitacaoEnum resposta, LocalDate dataResposta, String observacao) {
        this.solicitacao = solicitacao;
        this.resposta = resposta;
        this.dataResposta = dataResposta;
        this.observacao = observacao;
    }

    public RespostaEntity() {

    }
}
