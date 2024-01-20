package br.com.adoptpet.core.usecase.resposta;

import br.com.adoptpet.core.domain.solicitacao.Resposta;

public interface BuscarRespostaPorNumeroUseCase {
    Resposta find(final Long numero);
}
