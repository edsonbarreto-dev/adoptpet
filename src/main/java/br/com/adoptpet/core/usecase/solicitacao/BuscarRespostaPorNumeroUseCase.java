package br.com.adoptpet.core.usecase.solicitacao;

import br.com.adoptpet.core.domain.solicitacao.Resposta;

public interface BuscarRespostaPorNumeroUseCase {
    Resposta find(final Long numero);
}
