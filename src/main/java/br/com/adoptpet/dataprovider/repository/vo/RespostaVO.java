package br.com.adoptpet.dataprovider.repository.vo;

import br.com.adoptpet.core.domain.shared.StatusSolicitacaoEnum;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import lombok.Data;

import java.time.LocalDate;

@Data
public class RespostaVO {
    private Long numeroResposta;
    private Solicitacao solicitacao;
    private StatusSolicitacaoEnum resposta;
    private LocalDate dataResposta;
    private String observacao;
}
