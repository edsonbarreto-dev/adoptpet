package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.dataprovider.repository.entity.RespostaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RespostaRepository extends JpaRepository<RespostaEntity, Long> {
    RespostaEntity findByNumero(Long numeroResposta);
    RespostaEntity findBy(Resposta resposta);
}
