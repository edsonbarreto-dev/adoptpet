package br.com.adoptpet.core.dataprovider.funcionario;

import br.com.adoptpet.core.domain.funcionario.Funcionario;

import java.util.Optional;

public interface BuscarFuncionarioPorId {
    Optional<Funcionario> find(final Long id);

}
