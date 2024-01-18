package br.com.fiap.pettech.pettech.dataprovider;

import br.com.fiap.pettech.pettech.core.dataprovider.BuscarCep;
import br.com.fiap.pettech.pettech.core.shared.Endereco;
import br.com.fiap.pettech.pettech.dataprovider.client.BuscarEnderecoPorCepPessoa;
import br.com.fiap.pettech.pettech.dataprovider.client.mapper.EnderecoResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuscarEnderecoPorCepImpl implements BuscarCep {


    @Autowired
    private BuscarEnderecoPorCepPessoa enderecoPessoa;
    @Autowired
    private EnderecoResponseMapper enderecoResponseMapper;

    @Override
    public Endereco find(String cep) {
        var addressResponse = enderecoPessoa.find(cep);
        return enderecoResponseMapper.toAddress(addressResponse);
    }
}
