package br.com.adoptpet.core.usecase.resposta.impl;

import br.com.adoptpet.core.dataprovider.resposta.InserirResposta;
import br.com.adoptpet.core.domain.resposta.Resposta;
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
