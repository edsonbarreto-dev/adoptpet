package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.BuscarSolicitacaoPorNumero;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao.ExcluirSolicitacaoPorNumeroUseCase;

public class ExcluirSolicitacaoPorNumeroUseCaseImpl implements ExcluirSolicitacaoPorNumeroUseCase {
    private final BuscarSolicitacaoPorNumero buscarSolicitacaoPorNumero;
    private final ExcluirSolicitacaoPorNumeroUseCase excluirSolicitacaoPorNumeroUseCase;

    public ExcluirSolicitacaoPorNumeroUseCaseImpl(BuscarSolicitacaoPorNumero buscarSolicitacaoPorNumero,
                                                  ExcluirSolicitacaoPorNumeroUseCase excluirSolicitacaoPorNumeroUseCase) {
        this.buscarSolicitacaoPorNumero = buscarSolicitacaoPorNumero;
        this.excluirSolicitacaoPorNumeroUseCase = excluirSolicitacaoPorNumeroUseCase;
    }
    @Override
    public void delete(Long numero) {
        Solicitacao solicitacao = buscarSolicitacaoPorNumero.find(numero);
        excluirSolicitacaoPorNumeroUseCase.delete(solicitacao.getNumeroSolicitacao());

    }
}
