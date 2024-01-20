package br.com.adoptpet.dataprovider.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoEntity;

@Repository
public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, Long> {
}
