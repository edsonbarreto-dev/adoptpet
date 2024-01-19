package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.BuscarRespostaPorNumero;
import br.com.adoptpet.core.domain.solicitacao.Resposta;
import br.com.adoptpet.core.usecase.solicitacao.ExcluirRespostaPorNumeroUseCase;

public class ExcluirRespostaPorNumeroUseCaseImpl implements ExcluirRespostaPorNumeroUseCase {
    private final BuscarRespostaPorNumero buscarRespostaPorNumero;
    private final ExcluirRespostaPorNumeroUseCase excluirRespostaPorNumeroUseCase;

    public ExcluirRespostaPorNumeroUseCaseImpl(BuscarRespostaPorNumero buscarRespostaPorNumero, ExcluirRespostaPorNumeroUseCase excluirRespostaPorNumeroUseCase) {
        this.buscarRespostaPorNumero = buscarRespostaPorNumero;
        this.excluirRespostaPorNumeroUseCase = excluirRespostaPorNumeroUseCase;
    }
    @Override
    public void delete(Long numero) {
        Resposta resposta = buscarRespostaPorNumero.find(numero);
        excluirRespostaPorNumeroUseCase.delete(resposta.getNumeroResposta());


    }
}
