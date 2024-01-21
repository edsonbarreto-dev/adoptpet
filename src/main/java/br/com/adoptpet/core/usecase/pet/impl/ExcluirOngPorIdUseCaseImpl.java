package br.com.adoptpet.core.usecase.pet.impl;

import br.com.adoptpet.core.dataprovider.ong.ExcluirOngPorId;
import br.com.adoptpet.core.usecase.pet.ExcluirPetPorIdUseCase;

public class ExcluirOngPorIdUseCaseImpl implements ExcluirPetPorIdUseCase {
    private final ExcluirOngPorId excluirOngPorId;

    public ExcluirOngPorIdUseCaseImpl(ExcluirOngPorId excluirOngPorId) {
        this.excluirOngPorId = excluirOngPorId;
    }

    @Override
    public void delete(Long id) {
        excluirOngPorId.delete(id);
    }
}
