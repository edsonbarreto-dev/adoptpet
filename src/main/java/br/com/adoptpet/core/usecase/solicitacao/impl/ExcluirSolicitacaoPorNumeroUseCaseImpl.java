package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.BuscarSolicitacaoPorNumero;
import br.com.adoptpet.core.usecase.solicitacao.ExcluirSolicitacaoPorNumeroUseCase;
import br.com.adoptpet.dataprovider.repository.vo.SolicitacaoVO;

public class ExcluirSolicitacaoPorNumeroUseCaseImpl implements ExcluirSolicitacaoPorNumeroUseCase {
    private final BuscarSolicitacaoPorNumero<SolicitacaoVO> buscarSolicitacaoPorNumero;
    private final ExcluirSolicitacaoPorNumeroUseCase excluirSolicitacaoPorNumeroUseCase;

    public ExcluirSolicitacaoPorNumeroUseCaseImpl(
            BuscarSolicitacaoPorNumero<SolicitacaoVO> buscarSolicitacaoPorNumero,
            ExcluirSolicitacaoPorNumeroUseCase excluirSolicitacaoPorNumeroUseCase
    ) {
        this.buscarSolicitacaoPorNumero = buscarSolicitacaoPorNumero;
        this.excluirSolicitacaoPorNumeroUseCase = excluirSolicitacaoPorNumeroUseCase;
    }
    @Override
    public void delete(Long numero) {
        SolicitacaoVO solicitacaoVO = buscarSolicitacaoPorNumero.find(numero);
        excluirSolicitacaoPorNumeroUseCase.delete(solicitacaoVO.getNumeroSolicitacao());

    }
}
