package br.com.adoptpet.config.funcionario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.core.usecase.funcionario.impl.BuscaFuncionarioPorIdUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioPorIdImpl;

@Configuration
public class BuscaFuncionarioPorIdUseCaseImplConfig {

    @Bean
    public BuscaFuncionarioPorIdUseCaseImpl funcionarioPorIdUseCase(
            BuscarFuncionarioPorIdImpl buscarFuncionarioPorId
    ) {
        return new BuscaFuncionarioPorIdUseCaseImpl(buscarFuncionarioPorId);
    }

}
