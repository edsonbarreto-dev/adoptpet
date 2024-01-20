package br.com.adoptpet.core.usecase.ong;

import br.com.adoptpet.core.domain.ong.Ong;

public interface BuscarOngPorIdUseCase {
    Ong findById(final Long id);
}
