package br.com.adoptpet.core.usecase.solicitacao.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.AlterarResposta;
import br.com.adoptpet.core.domain.solicitacao.Resposta;
import br.com.adoptpet.core.usecase.solicitacao.AlterarRespostaUseCase;
import br.com.adoptpet.core.usecase.solicitacao.BuscarRespostaPorNumeroUseCase;

public class AlterarRespostaUseCaseImpl implements AlterarRespostaUseCase {
    private final BuscarRespostaPorNumeroUseCase buscarRespostaPorNumeroUseCase;
    private final AlterarResposta alterarResposta;

    public AlterarRespostaUseCaseImpl(BuscarRespostaPorNumeroUseCase buscarRespostaPorNumeroUseCase, AlterarResposta alterarResposta) {
        this.buscarRespostaPorNumeroUseCase = buscarRespostaPorNumeroUseCase;
        this.alterarResposta = alterarResposta;
    }

    @Override
    public void update(Resposta resposta) {
        buscarRespostaPorNumeroUseCase.find(resposta.getNumeroResposta());
        alterarResposta.update(resposta);
    }
}
