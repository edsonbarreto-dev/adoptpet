package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.core.domain.solicitacao_adocao.Solicitacao;
import br.com.adoptpet.dataprovider.repository.entity.SolicitacaoAdocaoEntity;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SolicitacaoAdocaoRepository extends JpaRepository<SolicitacaoAdocaoEntity, Long> {
    SolicitacaoAdocaoEntity findBySolicitacao(Solicitacao solicitacao);

    SolicitacaoAdocaoEntity findByNumero(Long numero);

    void deleteByNumero(Long numero);
}
