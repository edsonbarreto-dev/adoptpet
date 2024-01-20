package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.ExcluirSolicitacao;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao.ExcluirSolicitacaoUseCase;

public class ExcluirSolicitacaoUseCaseImpl implements ExcluirSolicitacaoUseCase {
    private final ExcluirSolicitacao excluirSolicitacao;

    public ExcluirSolicitacaoUseCaseImpl(
            ExcluirSolicitacao excluirSolicitacao
    ) {
        this.excluirSolicitacao = excluirSolicitacao;
    }

    @Override
    public void delete(Solicitacao solicitacao) {
        excluirSolicitacao.delete(solicitacao);
    }
}
