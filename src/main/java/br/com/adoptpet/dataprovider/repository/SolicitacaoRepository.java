package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, Long> {
}
