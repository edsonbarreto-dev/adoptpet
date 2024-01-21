package br.com.adoptpet.core.usecase.solicitacao_adocao;

import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;

public interface ExcluirSolicitacaoAdocaoUseCase {
    void delete(Solicitacao solicitacao);
}
