package br.com.adoptpet.core.usecase.solicitacao_adocao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao_adocao.BuscarSolicitacaoAdocao;
import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao_adocao.BuscarSolicitacaoAdocaoUseCase;

public class BuscarSolicitacaoAdocaoUseCaseImpl implements BuscarSolicitacaoAdocaoUseCase {
    private final BuscarSolicitacaoAdocao buscarSolicitacaoPorNumero;

    public BuscarSolicitacaoAdocaoUseCaseImpl(BuscarSolicitacaoAdocao buscarSolicitacaoPorNumero) {
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
