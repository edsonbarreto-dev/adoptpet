package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.adotante.BuscarAdotantePorId;
import br.com.adoptpet.core.dataprovider.shared.BuscarPorId;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorIdUseCase;

public class BuscarAdotantePorIdUseCaseImpl implements BuscarAdotantePorIdUseCase {
    private final BuscarPorId<Adotante> buscarAdotantePorId;
    //Substitui -> private final BuscarAdotantePorId buscarAdotantePorId;

    public BuscarAdotantePorIdUseCaseImpl(BuscarPorId<Adotante> buscarAdotantePorId) {
        this.buscarAdotantePorId = buscarAdotantePorId;
    }

    @Override
    public Pessoa find(Long id) {
        return buscarAdotantePorId.find(id)
                .orElseThrow(() -> new RuntimeException("Adotante não encontrado"));

        //Aqui ou usamos o optional ou fazemos um if, não acho que seja correto usar a solução que empregamos no dataprovider
    }
}
