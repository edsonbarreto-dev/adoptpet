package br.com.adoptpet.core.usecase.resposta.impl;

import br.com.adoptpet.core.dataprovider.resposta.BuscarResposta;
import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.core.usecase.resposta.BuscarRespostaUseCase;

public class BuscarRespostaUseCaseImpl implements BuscarRespostaUseCase {
    private final BuscarResposta buscarResposta;

    public BuscarRespostaUseCaseImpl(BuscarResposta buscarResposta) {
        this.buscarResposta = buscarResposta;
    }

    @Override
    public Resposta findBy(Resposta resposta) {
        return buscarResposta.findBy(resposta);
    }

    @Override
    public Resposta bindByNumero(Long numero) {
        return buscarResposta.findByNumero(numero);
    }
}
