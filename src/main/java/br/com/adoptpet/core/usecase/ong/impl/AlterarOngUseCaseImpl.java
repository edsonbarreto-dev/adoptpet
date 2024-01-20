package br.com.adoptpet.core.usecase.ong.impl;

import br.com.adoptpet.core.dataprovider.ong.AlterarOng;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.usecase.ong.AlterarOngUseCase;
import br.com.adoptpet.core.usecase.ong.BuscarOngPorIdUseCase;

public class AlterarOngUseCaseImpl implements AlterarOngUseCase {
    private final BuscarOngPorIdUseCase buscarOngPorIdUseCase;
    private final AlterarOng alterarOng;

    public AlterarOngUseCaseImpl( BuscarOngPorIdUseCase buscarOngPorIdUseCase, AlterarOng alterarOng) {
        this.buscarOngPorIdUseCase = buscarOngPorIdUseCase;
        this.alterarOng = alterarOng;
    }

    @Override
    public void update(Ong ong) {
        buscarOngPorIdUseCase.findById(ong.getId());
        alterarOng.update(ong);

    }
}
