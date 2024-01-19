package br.com.adoptpet.core.dataprovider.adotante;

import br.com.adoptpet.core.domain.shared.Pessoa;

import java.util.Optional;

public interface BuscarAdotantePorId {
    Optional<Pessoa> find(final Long id);
}
