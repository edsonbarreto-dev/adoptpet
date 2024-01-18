package br.com.fiap.pettech.pettech.core.dataprovider.funcionario;

import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;

import java.util.Optional;

public interface BuscarFuncionarioPorId {
    Optional<Funcionario> find(final Long id);

}
