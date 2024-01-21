package br.com.adoptpet.core.usecase.pet.impl;

import br.com.adoptpet.core.dataprovider.ong.ExcluirOng;
import br.com.adoptpet.core.usecase.pet.ExcluirPetPorIdUseCase;

public class ExcluirPetUseCaseImpl implements ExcluirPetPorIdUseCase {
    private final ExcluirOng excluirOng;

    public ExcluirPetUseCaseImpl(ExcluirOng excluirOng) {
        this.excluirOng = excluirOng;
    }

    @Override
    public void delete(Long id) {
        excluirOng.delete(id);
    }
}
