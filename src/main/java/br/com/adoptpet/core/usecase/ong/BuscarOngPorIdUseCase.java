package br.com.adoptpet.core.usecase.ong;

import br.com.adoptpet.core.domain.shared.Pessoa;

public interface BuscarOngPorIdUseCase<T> {
    T findById(final Long id);
}
