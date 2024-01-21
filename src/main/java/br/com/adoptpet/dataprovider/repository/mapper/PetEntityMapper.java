package br.com.adoptpet.dataprovider.repository.mapper;

import br.com.adoptpet.core.domain.pet.Pet;
import br.com.adoptpet.dataprovider.repository.entity.PetEntity;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PetEntityMapper {
    Pet toPet(PetEntity entity);

    PetEntity toPetEntity(Pet pet);
}
