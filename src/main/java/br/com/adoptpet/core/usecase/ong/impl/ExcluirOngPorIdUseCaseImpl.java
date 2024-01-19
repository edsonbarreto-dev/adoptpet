package br.com.adoptpet.core.usecase.ong.impl;

import br.com.adoptpet.core.dataprovider.ong.ExcluirOngPorId;
import br.com.adoptpet.core.usecase.ong.ExcluirOngPorIdUseCase;

public class ExcluirOngPorIdUseCaseImpl implements ExcluirOngPorIdUseCase {
    private final ExcluirOngPorId excluirOngPorId;

    public ExcluirOngPorIdUseCaseImpl(ExcluirOngPorId excluirOngPorId) {
        this.excluirOngPorId = excluirOngPorId;
    }

    @Override
    public void delete(Long id) {
        excluirOngPorId.delete(id);
    }
}
