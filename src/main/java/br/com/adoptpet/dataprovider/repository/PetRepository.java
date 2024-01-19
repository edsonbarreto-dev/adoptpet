package br.com.adoptpet.dataprovider.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.adoptpet.dataprovider.repository.entity.PetEntity;

@Repository
public interface PetRepository extends JpaRepository<PetEntity, Long> {


}
