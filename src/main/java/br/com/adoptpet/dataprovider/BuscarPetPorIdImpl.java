package br.com.adoptpet.dataprovider;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.dataprovider.pet.BuscarPet;
import br.com.adoptpet.dataprovider.repository.PetRepository;
import br.com.adoptpet.dataprovider.repository.entity.PetEntity;
import br.com.adoptpet.dataprovider.repository.mapper.PetEntityMapper;

@Component
public class BuscarPetPorIdImpl implements BuscarPet {
    @Autowired
    private PetRepository repository;
    @Autowired
    private PetEntityMapper mapper;

    @Override
    public Pet findBy(Pet pet) {
        PetEntity entity = repository.findBy(pet);

        return mapper.toPet(entity);
    }

    @Override
    public Pet findById(Long id) {
        PetEntity entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pet não encontrado"));

        return mapper.toPet(entity);
    }
}
