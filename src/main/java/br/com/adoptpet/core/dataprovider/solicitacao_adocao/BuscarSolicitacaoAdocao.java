package br.com.adoptpet.core.dataprovider.solicitacao_adocao;

import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;

public interface BuscarSolicitacaoAdocao {
    Solicitacao find(Solicitacao solicitacao);
    Solicitacao findByNumero(final Long numero);
}
