package br.com.adoptpet.core.dataprovider.shared;

import br.com.adoptpet.core.domain.shared.Endereco;

public interface BuscarEnderecoPorCep {
    Endereco find(final String cep);
}
