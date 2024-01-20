package br.com.adoptpet.core.usecase.ong.impl;

import br.com.adoptpet.core.dataprovider.ong.AlterarOng;
import br.com.adoptpet.core.dataprovider.ong.BuscarOngPorId;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.usecase.ong.AlterarOngUseCase;

public class AlterarOngUseCaseImpl implements AlterarOngUseCase {
    private final BuscarOngPorId buscarOngPorId;
    private final AlterarOng alterarOng;

    public AlterarOngUseCaseImpl( BuscarOngPorId buscarOngPorId, AlterarOng alterarOng) {
        this.buscarOngPorId = buscarOngPorId;
        this.alterarOng = alterarOng;
    }

    @Override
    public void update(Ong ong) {
        buscarOngPorId.find(ong.getId());
        alterarOng.update(ong);
    }
}
