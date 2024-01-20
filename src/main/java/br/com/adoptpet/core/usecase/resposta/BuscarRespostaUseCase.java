package br.com.adoptpet.core.usecase.resposta;

import br.com.adoptpet.core.domain.resposta.Resposta;
import br.com.adoptpet.dataprovider.repository.entity.RespostaEntity;

public interface BuscarRespostaUseCase {
    Resposta findBy(Resposta resposta);
    Resposta bindByNumero(Long numero);
}
