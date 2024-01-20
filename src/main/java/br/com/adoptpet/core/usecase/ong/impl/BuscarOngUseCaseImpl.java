package br.com.adoptpet.core.usecase.ong.impl;

import br.com.adoptpet.core.dataprovider.ong.BuscarOngPorId;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.usecase.ong.BuscarOngPorIdUseCase;

public class BuscarOngUseCaseImpl implements BuscarOngPorIdUseCase {
    private final BuscarOngPorId buscarOngPorId;

    public BuscarOngUseCaseImpl(BuscarOngPorId BuscarOngPorId) {
        this.buscarOngPorId = BuscarOngPorId;
    }

    @Override
    public Ong findById(Long id) {
        return buscarOngPorId.find(id);
    }
}
