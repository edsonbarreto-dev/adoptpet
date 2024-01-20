package br.com.adoptpet.core.usecase.solicitacao;

import br.com.adoptpet.core.domain.solicitacao.Solicitacao;

public interface BuscarSolicitacaoUseCase {
    Solicitacao findByNumero(final Long numero);
    Solicitacao find(Solicitacao solicitacao);
}
