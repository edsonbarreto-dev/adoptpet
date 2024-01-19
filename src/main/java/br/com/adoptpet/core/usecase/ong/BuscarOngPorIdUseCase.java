package br.com.adoptpet.core.usecase.ong;

import br.com.adoptpet.core.domain.shared.Pessoa;

public interface BuscarOngPorIdUseCase {
    Pessoa find(final Long id);
}
