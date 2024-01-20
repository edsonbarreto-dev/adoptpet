package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.core.domain.adotante.Adotante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.adoptpet.dataprovider.repository.entity.AdotanteEntity;

import java.util.Optional;

@Repository
public interface AdotanteRepository extends JpaRepository<AdotanteEntity, Long> {
    Optional<AdotanteEntity> findById(Long id);
    AdotanteEntity findBy(Adotante adotante);
}
