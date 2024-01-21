package br.com.adoptpet.core.usecase.ong.impl;

import br.com.adoptpet.core.dataprovider.shared.BuscarEnderecoPorCep;
import br.com.adoptpet.core.dataprovider.ong.InserirOng;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.usecase.ong.InserirOngUseCase;

public class InserirOngCaseImpl implements InserirOngUseCase {
    private final InserirOng inserirOng;
    private final BuscarEnderecoPorCep buscarCep;

    public InserirOngCaseImpl(InserirOng inserirOng, BuscarEnderecoPorCep buscarCep) {
        this.inserirOng = inserirOng;
        this.buscarCep = buscarCep;
    }

    @Override
    public void insert(Ong ong, String cep) {
        var endereco = buscarCep.find(cep);
        ong.setEndereco(endereco);
        inserirOng.insert(ong);
    }
}
