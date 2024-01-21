package br.com.adoptpet.core.usecase.solicitacao_adocao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao_adocao.ExcluirSolicitacaoAdocao;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao_adocao.ExcluirSolicitacaoAdocaoUseCase;

public class ExcluirSolicitacaoAdocaoUseCaseImpl implements ExcluirSolicitacaoAdocaoUseCase {
    private final ExcluirSolicitacaoAdocao excluirSolicitacao;

    public ExcluirSolicitacaoAdocaoUseCaseImpl(
            ExcluirSolicitacaoAdocao excluirSolicitacao
    ) {
        this.excluirSolicitacao = excluirSolicitacao;
    }

    @Override
    public void delete(Solicitacao solicitacao) {
        excluirSolicitacao.delete(solicitacao);
    }
}
