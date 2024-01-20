package br.com.adoptpet.core.usecase.solicitacao;

import br.com.adoptpet.core.domain.solicitacao.Solicitacao;

public interface ExcluirSolicitacaoUseCase {
    void delete(Solicitacao solicitacao);
}
