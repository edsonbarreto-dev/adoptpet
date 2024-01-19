package br.com.adoptpet.config.funcionario;


import br.com.adoptpet.core.dataprovider.funcionario.BuscarFuncionarioPorId;
import br.com.adoptpet.core.dataprovider.shared.BuscarPorId;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.usecase.funcionario.impl.BuscaFuncionarioPorIdUseCaseImpl;

import br.com.adoptpet.dataprovider.BuscarFuncionarioPorIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarFuncionarioConfig {

    @Bean
    public BuscaFuncionarioPorIdUseCaseImpl funcionarioPorIdUseCase(
            BuscarFuncionarioPorIdImpl buscarFuncionarioPorId) {
        return new BuscaFuncionarioPorIdUseCaseImpl((BuscarPorId<Funcionario>) buscarFuncionarioPorId);
    }

}
