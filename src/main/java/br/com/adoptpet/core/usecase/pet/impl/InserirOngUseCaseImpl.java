package br.com.adoptpet.core.usecase.pet.impl;

import br.com.adoptpet.core.dataprovider.pet.InserirPet;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.usecase.pet.InserirPetUseCase;

public class InserirOngUseCaseImpl implements InserirPetUseCase {
    private final InserirPet inserirPet;

    public InserirOngUseCaseImpl(InserirPet inserirPet) {
        this.inserirPet = inserirPet;
    }

    @Override
    public void insert(Pet pet) {
        inserirPet.insert(pet);
    }
}
