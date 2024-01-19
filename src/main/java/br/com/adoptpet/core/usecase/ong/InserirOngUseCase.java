package br.com.adoptpet.core.usecase.ong;

import br.com.adoptpet.core.domain.ong.Ong;

public interface InserirOngUseCase {
    void insert(Ong ong, String cep);
}
