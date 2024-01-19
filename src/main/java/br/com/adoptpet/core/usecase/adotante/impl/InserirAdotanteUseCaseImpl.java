package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.BuscarCep;
import br.com.adoptpet.core.dataprovider.adotante.AlterarAdotante;
import br.com.adoptpet.core.dataprovider.adotante.InserirAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorIdUseCase;
import br.com.adoptpet.core.usecase.adotante.InserirAdotanteUseCase;

public class InserirAdotanteUseCaseImpl implements InserirAdotanteUseCase {
    private final BuscarAdotantePorIdUseCase buscaAdotantePorIdUseCase;

    private final BuscarCep buscarCep;

    private final InserirAdotante inserirAdotante;

    public InserirAdotanteUseCaseImpl(
            BuscarAdotantePorIdUseCase buscaAdotantePorIdUseCase,
            BuscarCep buscarCep,
            InserirAdotante inserirAdotante
    ) {
        this.buscaAdotantePorIdUseCase = buscaAdotantePorIdUseCase;
        this.buscarCep = buscarCep;
        this.inserirAdotante = inserirAdotante;
    }

    @Override
    public void insert(Adotante adotante, String cep) {
        buscaAdotantePorIdUseCase.find(adotante.getId());
        var endereco = buscarCep.find(cep);
        adotante.setEndereco(endereco);
        inserirAdotante.insert(adotante);
    }
}
