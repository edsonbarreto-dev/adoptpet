package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.BuscarCep;
import br.com.adoptpet.core.dataprovider.adotante.AlterarAdotante;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.usecase.adotante.AlterarAdotanteUseCase;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorIdUseCase;

public class AlterarAdotanteUseCaseImpl implements AlterarAdotanteUseCase {
    private final BuscarAdotantePorIdUseCase buscaAdotantePorIdUseCase;

    private final BuscarCep buscarCep;

    private final AlterarAdotante alterarAdotante;

    public AlterarAdotanteUseCaseImpl(
            BuscarAdotantePorIdUseCase buscaAdotantePorIdUseCase,
            BuscarCep buscarCep,
            AlterarAdotante alterarAdotante
    ) {
        this.buscaAdotantePorIdUseCase = buscaAdotantePorIdUseCase;
        this.buscarCep = buscarCep;
        this.alterarAdotante = alterarAdotante;
    }

    @Override
    public void update(Pessoa adotante, String cep) {
        buscaAdotantePorIdUseCase.findById(adotante.getId());
        var endereco = buscarCep.find(cep);
        adotante.setEndereco(endereco);
        alterarAdotante.update(adotante);
    }
}
