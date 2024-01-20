package br.com.adoptpet.core.usecase.resposta.impl;

import br.com.adoptpet.core.dataprovider.solicitacao.InserirResposta;
import br.com.adoptpet.core.domain.solicitacao.Resposta;
import br.com.adoptpet.core.usecase.resposta.InserirRespostaUseCase;

public class InserirRespostaUseCaseImpl implements InserirRespostaUseCase {
    private final InserirResposta inserirResposta;

    public InserirRespostaUseCaseImpl(InserirResposta inserirResposta) {
        this.inserirResposta = inserirResposta;
    }

    @Override
    public void insert(Resposta resposta) {
        inserirResposta.insert(resposta);
    }
}
