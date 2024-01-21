package br.com.adoptpet.core.dataprovider.solicitacao_adocao;

import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;

public interface ExcluirSolicitacaoAdocao {
    void delete(Solicitacao solicitacao);
    void deleteByNumero(final Long numero);
}
