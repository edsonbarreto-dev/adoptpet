package br.com.adoptpet.core.usecase.adotante;

import br.com.adoptpet.core.domain.shared.Pessoa;

public interface BuscarAdotantePorIdUseCase {

    Pessoa find(final Long id);

}
