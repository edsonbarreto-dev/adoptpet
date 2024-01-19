package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.adotante.BuscarAdotantePorId;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorIdUseCase;

public class BuscarAdotantePorIdUseCaseImpl implements BuscarAdotantePorIdUseCase {
    private final BuscarAdotantePorId buscarAdotantePorId;

    public BuscarAdotantePorIdUseCaseImpl(BuscarAdotantePorId buscarAdotantePorId) {
        this.buscarAdotantePorId = buscarAdotantePorId;
    }

    @Override
    public Pessoa find(Long id) {
        return buscarAdotantePorId.find(id)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
