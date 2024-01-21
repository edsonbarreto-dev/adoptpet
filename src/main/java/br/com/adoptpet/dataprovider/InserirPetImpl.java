package br.com.adoptpet.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.core.dataprovider.pet.InserirPet;
import br.com.adoptpet.dataprovider.repository.PetRepository;
import br.com.adoptpet.dataprovider.repository.mapper.PetEntityMapper;

@Component
public class InserirPetImpl implements InserirPet {
    @Autowired
    private PetRepository repository;
    @Autowired
    private PetEntityMapper mapper;

    @Override
    public void insert(Pet pet) {
        var entity = mapper.toPetEntity(pet);
        repository.save(entity);
    }
}
