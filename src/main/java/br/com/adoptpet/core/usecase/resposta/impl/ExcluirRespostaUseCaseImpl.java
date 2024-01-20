package br.com.adoptpet.core.usecase.resposta.impl;

import br.com.adoptpet.core.dataprovider.resposta.ExcluirResposta;
import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.core.usecase.resposta.ExcluirRespostaUseCase;

public class ExcluirRespostaUseCaseImpl implements ExcluirRespostaUseCase {
    private final ExcluirResposta excluirResposta;

    public ExcluirRespostaUseCaseImpl(
            ExcluirResposta excluirResposta
    ) {
        this.excluirResposta = excluirResposta;
    }

    @Override
    public void delete(Resposta resposta) {
        excluirResposta.delete(resposta);
    }

    @Override
    public void deletePorNumero(Long numero) {
        excluirResposta.deleteByNumero(numero);
    }
}
