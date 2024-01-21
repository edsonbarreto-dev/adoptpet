package br.com.adoptpet.core.usecase.solicitacao_adocao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao_adocao.AlterarSolicitacaoAdocao;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao_adocao.AlterarSolicitacaoAdocaoUseCase;

public class AlterarSolicitacaoAdocaoUseCaseImpl implements AlterarSolicitacaoAdocaoUseCase {
    private final AlterarSolicitacaoAdocao alterarSolicitacao;

    public AlterarSolicitacaoAdocaoUseCaseImpl(AlterarSolicitacaoAdocao solicitacao) {
        this.alterarSolicitacao = solicitacao;
    }

    @Override
    public void update(Solicitacao solicitacao) {
        alterarSolicitacao.update(solicitacao);
    }
}
