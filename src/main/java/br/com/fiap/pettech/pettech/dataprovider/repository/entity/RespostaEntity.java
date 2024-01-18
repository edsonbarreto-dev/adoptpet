package br.com.fiap.pettech.pettech.dataprovider.repository.entity;

import br.com.fiap.pettech.pettech.core.domain.solicitacao.Solicitacao;
import br.com.fiap.pettech.pettech.core.shared.StatusSolicitacaoEnum;
import jakarta.persistence.*;
import jdk.jfr.Enabled;

import java.time.LocalDate;
@Entity
@Table(name="RespostaSolicitacao")
public class RespostaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private SolicitacaoEntity solicitacao;
    @Enumerated(EnumType.STRING)
    private StatusSolicitacaoEnum resposta = StatusSolicitacaoEnum.EM_ANALISE;
    private LocalDate dataResposta = LocalDate.now();
    private String observacao;

    public RespostaEntity(SolicitacaoEntity solicitacao, StatusSolicitacaoEnum resposta, LocalDate dataResposta, String observacao) {
        this.solicitacao = solicitacao;
        this.resposta = resposta;
        this.dataResposta = dataResposta;
        this.observacao = observacao;
    }

    public RespostaEntity() {

    }
}
