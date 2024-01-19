package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.AlterarSolicitacao;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao.AlterarSolicitacaoUseCase;
import br.com.adoptpet.core.usecase.solicitacao.BuscarSolicitacaoPorNumeroUseCase;

public class AlterarSolicitacaoUseCaseImpl implements AlterarSolicitacaoUseCase {

    private final BuscarSolicitacaoPorNumeroUseCase buscarSolicitacaoPorNumeroUseCase;

    private final AlterarSolicitacao alterarSolicitacao;
    public AlterarSolicitacaoUseCaseImpl(BuscarSolicitacaoPorNumeroUseCase buscarSolicitacaoPorNumeroUseCase,
                                         AlterarSolicitacao solicitacao) {
        this.buscarSolicitacaoPorNumeroUseCase = buscarSolicitacaoPorNumeroUseCase;
        this.alterarSolicitacao = solicitacao;
    }

    @Override
    public void update(Solicitacao solicitacao) {
        buscarSolicitacaoPorNumeroUseCase.find(solicitacao.getNumeroSolicitacao());
        alterarSolicitacao.update(solicitacao);
    }
}
