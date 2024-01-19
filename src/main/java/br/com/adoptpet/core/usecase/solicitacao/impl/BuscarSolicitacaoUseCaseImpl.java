package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.BuscarSolicitacaoPorNumero;
import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import br.com.adoptpet.core.usecase.solicitacao.BuscarSolicitacaoPorNumeroUseCase;

public class BuscarSolicitacaoUseCaseImpl implements BuscarSolicitacaoPorNumeroUseCase {]
    private final BuscarSolicitacaoPorNumero buscarSolicitacaoPorNumero;

    public BuscarSolicitacaoUseCaseImpl(BuscarSolicitacaoPorNumero buscarSolicitacaoPorNumero) {
        this.buscarSolicitacaoPorNumero = buscarSolicitacaoPorNumero;
    }

    @Override
    public Solicitacao find(Long numero) {
         Solicitacao solicitacao = buscarSolicitacaoPorNumero.find(numero);
         if(solicitacao == null)
             throw new RuntimeException("Solicitação não encontrada.");
         return solicitacao;
    }
}
