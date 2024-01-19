package br.com.adoptpet.core.domain.solicitacao;

import br.com.adoptpet.core.domain.shared.StatusSolicitacaoEnum;

import java.time.LocalDate;

public class Resposta {
    private Long numeroResposta;
    private Solicitacao solicitacao;
    private StatusSolicitacaoEnum resposta = StatusSolicitacaoEnum.EM_ANALISE;
    private LocalDate dataResposta = LocalDate.now();
    private String observacao;

    public Resposta(Solicitacao solicitacao, StatusSolicitacaoEnum resposta, LocalDate dataResposta, String observacao) {
        this.solicitacao = solicitacao;
        this.resposta = resposta;
        this.dataResposta = dataResposta;
        this.observacao = observacao;
    }
}
