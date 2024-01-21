package br.com.adoptpet.core.usecase.pet;

import br.com.adoptpet.core.domain.pet.Pet;

public interface BuscarPetUseCase {
    Pet findBy(Pet pet);
    Pet findById(Long id);
}
