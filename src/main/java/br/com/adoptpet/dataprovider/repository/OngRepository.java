package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.dataprovider.repository.entity.OngEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OngRepository extends JpaRepository<OngEntity, Long> {
}
