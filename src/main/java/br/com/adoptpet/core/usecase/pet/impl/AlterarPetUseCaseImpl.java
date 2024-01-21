package br.com.adoptpet.core.usecase.pet.impl;

import br.com.adoptpet.core.dataprovider.ong.AlterarOng;
import br.com.adoptpet.core.dataprovider.ong.BuscarOngPorId;
import br.com.adoptpet.core.dataprovider.pet.AlterarPet;
import br.com.adoptpet.core.dataprovider.pet.BuscarPet;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.usecase.pet.AlterarPetUseCase;

public class AlterarPetUseCaseImpl implements AlterarPetUseCase {
    private BuscarPet buscarPet;
    private AlterarPet alterarPet;

    public AlterarPetUseCaseImpl(BuscarPet buscarPet, AlterarPet alterarPet) {
        this.buscarPet =  buscarPet;
        this.alterarPet = alterarPet;
    }

    @Override
    public void update(Pet pet) {
        Pet petManaged = buscarPet.findBy(pet);
        alterarPet.update(petManaged);
    }
}
