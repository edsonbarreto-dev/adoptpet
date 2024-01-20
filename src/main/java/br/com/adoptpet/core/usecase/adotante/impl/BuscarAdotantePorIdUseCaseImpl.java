package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorIdUseCase;
import br.com.adoptpet.dataprovider.BuscarAdotantePorIdImpl;

public class BuscarAdotantePorIdUseCaseImpl implements BuscarAdotantePorIdUseCase {
    private final BuscarAdotantePorIdImpl buscarAdotantePorId;

    public BuscarAdotantePorIdUseCaseImpl(BuscarAdotantePorIdImpl buscarAdotantePorId) {
        this.buscarAdotantePorId = buscarAdotantePorId;
    }

    @Override
    public Adotante findById(Long id) {
        return buscarAdotantePorId.findById(id);
    }
}
