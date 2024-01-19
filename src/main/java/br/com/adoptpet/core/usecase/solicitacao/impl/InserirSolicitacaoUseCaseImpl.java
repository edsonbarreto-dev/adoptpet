package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.InserirSolicitacao;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao.InserirSolicitacaoUseCase;

public class InserirSolicitacaoUseCaseImpl implements InserirSolicitacaoUseCase {
    private final InserirSolicitacao inserirSolicitacao;

    public InserirSolicitacaoUseCaseImpl(InserirSolicitacao inserirSolicitacao) {
        this.inserirSolicitacao = inserirSolicitacao;
    }
    @Override
    public void insert(Solicitacao solicitacao) {
        inserirSolicitacao.insert(solicitacao);
    }
}
