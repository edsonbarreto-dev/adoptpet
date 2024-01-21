package br.com.adoptpet.core.usecase.adotante.impl;

import br.com.adoptpet.core.dataprovider.shared.BuscarEnderecoPorCep;
import br.com.adoptpet.core.dataprovider.adotante.AlterarAdotante;
import br.com.adoptpet.core.domain.adotante.Adotante;
import br.com.adoptpet.core.usecase.adotante.AlterarAdotanteUseCase;
import br.com.adoptpet.core.usecase.adotante.BuscarAdotantePorIdUseCase;

public class AlterarAdotanteUseCaseImpl implements AlterarAdotanteUseCase {
    private final BuscarAdotantePorIdUseCase buscaAdotantePorIdUseCase;

    private final BuscarEnderecoPorCep buscarCep;

    private final AlterarAdotante alterarAdotante;

    public AlterarAdotanteUseCaseImpl(
            BuscarAdotantePorIdUseCase buscaAdotantePorIdUseCase,
            BuscarEnderecoPorCep buscarCep,
            AlterarAdotante alterarAdotante
    ) {
        this.buscaAdotantePorIdUseCase = buscaAdotantePorIdUseCase;
        this.buscarCep = buscarCep;
        this.alterarAdotante = alterarAdotante;
    }

    @Override
    public void update(Adotante adotante, String cep) throws Exception {
        buscaAdotantePorIdUseCase.findById(adotante.getId());
        var endereco = buscarCep.find(cep);
        adotante.setEndereco(endereco);
        alterarAdotante.update(adotante);
    }
}
