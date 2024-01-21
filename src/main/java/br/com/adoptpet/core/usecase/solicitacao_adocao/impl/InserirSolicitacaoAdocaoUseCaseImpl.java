package br.com.adoptpet.core.usecase.solicitacao_adocao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao_adocao.InserirSolicitacaoAdocao;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao_adocao.InserirSolicitacaoAdocaoUseCase;

public class InserirSolicitacaoAdocaoUseCaseImpl implements InserirSolicitacaoAdocaoUseCase {
    private final InserirSolicitacaoAdocao inserirSolicitacao;

    public InserirSolicitacaoAdocaoUseCaseImpl(InserirSolicitacaoAdocao inserirSolicitacao) {
        this.inserirSolicitacao = inserirSolicitacao;
    }
    @Override
    public void insert(Solicitacao solicitacao) {
        inserirSolicitacao.insert(solicitacao);
    }
}
