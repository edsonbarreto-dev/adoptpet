package br.com.adoptpet.core.usecase.resposta;

import br.com.adoptpet.core.domain.resposta.Resposta;

public interface ExcluirRespostaUseCase {
    void delete(Resposta resposta);
    void deletePorNumero(Long numero);
}
