package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.AlterarSolicitacao;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao.AlterarSolicitacaoUseCase;

public class AlterarSolicitacaoUseCaseImpl implements AlterarSolicitacaoUseCase {
    private final AlterarSolicitacao alterarSolicitacao;

    public AlterarSolicitacaoUseCaseImpl(AlterarSolicitacao solicitacao) {
        this.alterarSolicitacao = solicitacao;
    }

    @Override
    public void update(Solicitacao solicitacao) {
        alterarSolicitacao.update(solicitacao);
    }
}
