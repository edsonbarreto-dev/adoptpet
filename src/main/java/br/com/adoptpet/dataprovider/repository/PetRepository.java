package br.com.adoptpet.dataprovider.repository;

import java.util.Optional;
import org.springframework.stereotype.Repository;

import br.com.adoptpet.core.domain.pet.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.adoptpet.dataprovider.repository.entity.PetEntity;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Long> {
    PetEntity findBy(Pet pet);

    Optional<PetEntity> findById(Long id);
}
