package br.com.fiap.pettech.pettech.core.domain.dataprovider.funcionario;

import br.com.fiap.pettech.pettech.core.domain.funcionario.Funcionario;

import java.util.Optional;

public interface FindEmployeeById {

    Optional<Funcionario> find(final String id);
}
