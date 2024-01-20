package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.BuscarSolicitacaoPorNumero;
import br.com.adoptpet.core.usecase.solicitacao.BuscarSolicitacaoPorNumeroUseCase;
import br.com.adoptpet.dataprovider.repository.vo.SolicitacaoVO;

public class BuscarSolicitacaoPorNumeroUseCaseImpl implements BuscarSolicitacaoPorNumeroUseCase<SolicitacaoVO> {
    private final BuscarSolicitacaoPorNumero buscarSolicitacaoPorNumero;

    public BuscarSolicitacaoPorNumeroUseCaseImpl(BuscarSolicitacaoPorNumero buscarSolicitacaoPorNumero) {
        this.buscarSolicitacaoPorNumero = buscarSolicitacaoPorNumero;
    }

    @Override
    public SolicitacaoVO find(Long numero) {
        return (SolicitacaoVO) buscarSolicitacaoPorNumero.find(numero);
    }
}
