package br.com.adoptpet.core.dataprovider.resposta;

import br.com.adoptpet.core.domain.resposta.Resposta;

public interface ExcluirResposta {
    void delete(Resposta resposta);
    void deleteByNumero(Long numero);
}
