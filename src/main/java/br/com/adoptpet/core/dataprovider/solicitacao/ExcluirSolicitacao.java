package br.com.adoptpet.core.dataprovider.solicitacao;

import br.com.adoptpet.core.domain.solicitacao.Solicitacao;

public interface ExcluirSolicitacao {
    void delete(Solicitacao solicitacao);
    void deleteByNumero(final Long numero);
}
