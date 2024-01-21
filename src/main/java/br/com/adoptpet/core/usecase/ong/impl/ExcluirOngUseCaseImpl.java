package br.com.adoptpet.core.usecase.ong.impl;

import br.com.adoptpet.core.dataprovider.ong.ExcluirOng;
import br.com.adoptpet.core.usecase.ong.ExcluirOngUseCase;

public class ExcluirOngUseCaseImpl implements ExcluirOngUseCase {
    private final ExcluirOng excluirOng;

    public ExcluirOngUseCaseImpl(ExcluirOng excluirOng) {
        this.excluirOng = excluirOng;
    }

    @Override
    public void delete(Long id) {
        excluirOng.delete(id);
    }
}
