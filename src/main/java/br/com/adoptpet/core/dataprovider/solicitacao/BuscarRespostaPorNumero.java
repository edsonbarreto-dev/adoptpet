package br.com.adoptpet.core.dataprovider.solicitacao;

import br.com.adoptpet.core.domain.solicitacao.Resposta;

public interface BuscarRespostaPorNumero {
    Resposta find(final Long id);
}
