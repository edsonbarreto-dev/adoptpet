package br.com.fiap.pettech.pettech.core.dataprovider;

import br.com.fiap.pettech.pettech.core.shared.Endereco;

public interface BuscarCep {
    Endereco find(final String cep);
}
