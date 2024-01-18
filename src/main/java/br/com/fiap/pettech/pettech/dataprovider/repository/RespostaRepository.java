package br.com.fiap.pettech.pettech.dataprovider.repository;

import br.com.fiap.pettech.pettech.dataprovider.repository.entity.RespostaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaEntity, Long> {
}
