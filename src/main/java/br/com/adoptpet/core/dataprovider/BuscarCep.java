package br.com.adoptpet.core.dataprovider;

import br.com.adoptpet.core.domain.shared.Endereco;

public interface BuscarCep {
    Endereco find(final String cep);
}
