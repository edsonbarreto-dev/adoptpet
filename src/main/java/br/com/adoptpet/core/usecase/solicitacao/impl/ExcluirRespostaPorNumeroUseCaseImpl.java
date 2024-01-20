package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.usecase.solicitacao.ExcluirRespostaPorNumeroUseCase;
import br.com.adoptpet.dataprovider.BuscarRespostaPorNumeroImpl;
import br.com.adoptpet.dataprovider.repository.vo.RespostaVO;

public class ExcluirRespostaPorNumeroUseCaseImpl implements ExcluirRespostaPorNumeroUseCase {
    private final BuscarRespostaPorNumeroImpl buscarRespostaPorNumero;
    private final ExcluirRespostaPorNumeroUseCaseImpl excluirRespostaPorNumeroUseCase;

    public ExcluirRespostaPorNumeroUseCaseImpl(
            BuscarRespostaPorNumeroImpl buscarRespostaPorNumero,
            ExcluirRespostaPorNumeroUseCaseImpl excluirRespostaPorNumeroUseCase
    ) {
        this.buscarRespostaPorNumero = buscarRespostaPorNumero;
        this.excluirRespostaPorNumeroUseCase = excluirRespostaPorNumeroUseCase;
    }

    @Override
    public void delete(Long numero) {
        RespostaVO resposta = buscarRespostaPorNumero.findById(numero);
        excluirRespostaPorNumeroUseCase.delete(resposta.getNumeroResposta());
    }
}
