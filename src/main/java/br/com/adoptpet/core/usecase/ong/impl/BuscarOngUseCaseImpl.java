package br.com.adoptpet.core.usecase.ong.impl;

import br.com.adoptpet.core.dataprovider.shared.BuscarPorId;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.ong.BuscarOngPorIdUseCase;

public class BuscarOngUseCaseImpl implements BuscarOngPorIdUseCase {
    private final BuscarPorId<Ong> buscarPorId;

    public BuscarOngUseCaseImpl(BuscarPorId<Ong> buscarPorId) {
        this.buscarPorId = buscarPorId;
    }

    @Override
    public Pessoa findById(Long id) {
        return buscarPorId.findById(id);
    }
}
