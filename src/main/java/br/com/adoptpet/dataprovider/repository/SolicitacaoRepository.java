package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.core.domain.solicitacao.Solicitacao;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoEntity;

@Repository
public interface SolicitacaoRepository extends JpaRepository<SolicitacaoEntity, Long> {
    SolicitacaoEntity findBySolicitacao(Solicitacao solicitacao);

    SolicitacaoEntity findByNumero(Long numero);

    void deleteByNumero(Long numero);
}
