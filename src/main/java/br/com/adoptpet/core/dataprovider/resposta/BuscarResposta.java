package br.com.adoptpet.core.dataprovider.resposta;

import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.dataprovider.repository.entity.RespostaEntity;

public interface BuscarResposta {
    Resposta findBy(Resposta resposta);
    Resposta findByNumero(Long numero);
}
