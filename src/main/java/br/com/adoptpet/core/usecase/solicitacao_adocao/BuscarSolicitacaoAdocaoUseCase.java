package br.com.adoptpet.core.usecase.solicitacao_adocao;

import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;

public interface BuscarSolicitacaoAdocaoUseCase {
    Solicitacao findByNumero(final Long numero);
    Solicitacao find(Solicitacao solicitacao);
}
