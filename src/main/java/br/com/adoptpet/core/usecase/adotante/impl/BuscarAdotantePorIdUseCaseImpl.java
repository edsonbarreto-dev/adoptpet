package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.shared.BuscarPorId;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorIdUseCase;

public class BuscarAdotantePorIdUseCaseImpl implements BuscarAdotantePorIdUseCase {
    private final BuscarPorId<Adotante> buscarAdotantePorId;

    public BuscarAdotantePorIdUseCaseImpl(BuscarPorId<Adotante> buscarAdotantePorId) {
        this.buscarAdotantePorId = buscarAdotantePorId;
    }

    @Override
    public Pessoa findById(Long id) {
        return buscarAdotantePorId.findById(id);
    }
}
