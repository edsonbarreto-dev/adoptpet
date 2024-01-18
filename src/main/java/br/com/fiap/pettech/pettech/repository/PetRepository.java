package br.com.fiap.pettech.pettech.repository;

import br.com.fiap.pettech.pettech.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {


}
