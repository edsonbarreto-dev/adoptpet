package br.com.adoptpet.core.dataprovider.adotante;

import br.com.adoptpet.core.domain.shared.Pessoa;

import java.util.Optional;

public interface BuscarAdotantePorId<T> {
   T find(final Long id);
}
