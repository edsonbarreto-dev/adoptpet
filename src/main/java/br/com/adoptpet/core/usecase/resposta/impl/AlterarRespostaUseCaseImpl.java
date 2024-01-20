package br.com.adoptpet.core.usecase.resposta.impl;

import br.com.adoptpet.core.dataprovider.resposta.AlterarResposta;
import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.core.usecase.resposta.AlterarRespostaUseCase;

public class AlterarRespostaUseCaseImpl implements AlterarRespostaUseCase {
    private final AlterarResposta alterarResposta;

    public AlterarRespostaUseCaseImpl(AlterarResposta alterarResposta) {
        this.alterarResposta = alterarResposta;
    }

    @Override
    public void update(Resposta resposta) {
        alterarResposta.update(resposta);
    }
}
