package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.BuscarSolicitacao;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao.BuscarSolicitacaoUseCase;

public class BuscarSolicitacaoUseCaseImpl implements BuscarSolicitacaoUseCase {
    private final BuscarSolicitacao buscarSolicitacaoPorNumero;

    public BuscarSolicitacaoUseCaseImpl(BuscarSolicitacao buscarSolicitacaoPorNumero) {
        this.buscarSolicitacaoPorNumero = buscarSolicitacaoPorNumero;
    }

    @Override
    public Solicitacao findByNumero(Long numero) {
        return buscarSolicitacaoPorNumero.findByNumero(numero);
    }

    @Override
    public Solicitacao find(Solicitacao solicitacao) {
        return buscarSolicitacaoPorNumero.find(solicitacao);
    }
}
