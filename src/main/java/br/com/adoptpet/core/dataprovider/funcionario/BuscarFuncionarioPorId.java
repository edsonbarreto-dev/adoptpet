package br.com.adoptpet.core.dataprovider.funcionario;

import br.com.adoptpet.core.domain.funcionario.Funcionario;

public interface BuscarFuncionarioPorId {
    Funcionario find(Funcionario funcionario);
}
