package br.com.adoptpet.core.usecase.solicitacao;

import br.com.adoptpet.core.domain.solicitacao.Solicitacao;

public interface BuscarSolicitacaoPorNumeroUseCase {
    Solicitacao find(final Long numero);
}
