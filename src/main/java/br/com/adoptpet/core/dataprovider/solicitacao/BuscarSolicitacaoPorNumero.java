package br.com.adoptpet.core.dataprovider.solicitacao;

import br.com.adoptpet.core.domain.solicitacao.Solicitacao;

public interface BuscarSolicitacaoPorNumero<T> {
    T find(final Long id);
}
