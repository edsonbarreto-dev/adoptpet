package br.com.adoptpet.core.domain.dataprovider.funcionario;

import br.com.adoptpet.core.domain.shared.Pessoa;

public interface BuscarFuncionarioPorId<T> {
    T find(final Long id);
}
