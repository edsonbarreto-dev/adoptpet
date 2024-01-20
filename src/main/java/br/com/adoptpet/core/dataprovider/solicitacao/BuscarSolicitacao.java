package br.com.adoptpet.core.dataprovider.solicitacao;

import br.com.adoptpet.core.domain.solicitacao.Solicitacao;

public interface BuscarSolicitacao {
    Solicitacao find(Solicitacao solicitacao);
    Solicitacao findByNumero(final Long numero);
}
