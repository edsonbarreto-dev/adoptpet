package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorIdUseCase;
import br.com.adoptpet.dataprovider.BuscarAdotanteImpl;

public class BuscarAdotanteUseCaseImpl implements BuscarAdotantePorIdUseCase {
    private final BuscarAdotanteImpl buscarAdotantePorId;

    public BuscarAdotanteUseCaseImpl(BuscarAdotanteImpl buscarAdotantePorId) {
        this.buscarAdotantePorId = buscarAdotantePorId;
    }

    @Override
    public Adotante findById(Long id) throws Exception {
        return buscarAdotantePorId.findById(id);
    }
}
