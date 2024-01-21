package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.shared.BuscarEnderecoPorCep;
import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.dataprovider.repository.BuscarEnderecoPorCepPessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarEnderecoPorCepImpl implements BuscarEnderecoPorCep {
    @Autowired
    private BuscarEnderecoPorCepPessoa enderecoPessoa;

    @Override
    public Endereco find(String cep) {
        return enderecoPessoa.find(cep)
                .orElseThrow(() -> new RuntimeException("Endereço não localizado"));
    }
}
