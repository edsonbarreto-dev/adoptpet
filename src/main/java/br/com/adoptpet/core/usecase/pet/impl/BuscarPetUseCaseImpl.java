package br.com.adoptpet.core.usecase.pet.impl;

import br.com.adoptpet.core.dataprovider.pet.BuscarPet;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.usecase.pet.BuscarPetUseCase;

public class BuscarPetUseCaseImpl implements BuscarPetUseCase {
    private final BuscarPet buscarPet;

    public BuscarPetUseCaseImpl(BuscarPet buscarPet) {
        this.buscarPet = buscarPet;
    }

    @Override
    public Pet findBy(Pet pet) {
        return buscarPet.findBy(pet);
    }

    @Override
    public Pet findById(Long id) {
        return buscarPet.findById(id);
    }
}
