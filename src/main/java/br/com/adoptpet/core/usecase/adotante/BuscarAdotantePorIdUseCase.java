package br.com.adoptpet.core.usecase.adotante;

import br.com.adoptpet.core.domain.adotante.Adotante;

public interface BuscarAdotantePorIdUseCase {

    Adotante findById(final Long id) throws Exception;

}
