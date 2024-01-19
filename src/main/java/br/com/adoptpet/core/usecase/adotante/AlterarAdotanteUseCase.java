package br.com.adoptpet.core.usecase.adotante;

import br.com.adoptpet.core.domain.shared.Pessoa;

public interface AlterarAdotanteUseCase {

    void update(Pessoa adotante, String cep);
}
