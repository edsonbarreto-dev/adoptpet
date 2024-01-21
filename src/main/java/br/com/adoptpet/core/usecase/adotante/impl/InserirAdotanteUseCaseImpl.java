package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.shared.BuscarEnderecoPorCep;
import br.com.adoptpet.core.dataprovider.adotante.InserirAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorIdUseCase;
import br.com.adoptpet.core.usecase.adotante.InserirAdotanteUseCase;

public class InserirAdotanteUseCaseImpl implements InserirAdotanteUseCase {
    private final BuscarAdotantePorIdUseCase buscaAdotantePorIdUseCase;

    private final BuscarEnderecoPorCep buscarEnderecoPorCep;

    private final InserirAdotante inserirAdotante;

    public InserirAdotanteUseCaseImpl(
            BuscarAdotantePorIdUseCase buscaAdotantePorIdUseCase,
            BuscarEnderecoPorCep buscarEnderecoPorCep,
            InserirAdotante inserirAdotante
    ) {
        this.buscaAdotantePorIdUseCase = buscaAdotantePorIdUseCase;
        this.buscarEnderecoPorCep = buscarEnderecoPorCep;
        this.inserirAdotante = inserirAdotante;
    }

    @Override
    public void insert(Adotante adotante, String cep) throws Exception {
        var endereco = buscarEnderecoPorCep.find(cep);
        adotante.setEndereco(endereco);
        buscaAdotantePorIdUseCase.findById(adotante.getId());
        inserirAdotante.insert(adotante);
    }
}
