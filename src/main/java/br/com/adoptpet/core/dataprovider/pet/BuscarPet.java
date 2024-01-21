package br.com.adoptpet.core.dataprovider.pet;

import br.com.adoptpet.core.domain.pet.Pet;

public interface BuscarPet {
    Pet findBy(Pet pet);
    Pet findById(Long id);
}
