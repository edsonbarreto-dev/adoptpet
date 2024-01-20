package br.com.adoptpet.core.usecase.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;
public interface InserirAdotanteUseCase {

    void insert(Adotante adotante, String cep) throws Exception;
}
