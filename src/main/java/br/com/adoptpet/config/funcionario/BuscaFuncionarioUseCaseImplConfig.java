package br.com.adoptpet.config.funcionario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.core.usecase.funcionario.impl.BuscaFuncionarioUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioImpl;

@Configuration
public class BuscaFuncionarioUseCaseImplConfig {

    @Bean
    public BuscaFuncionarioUseCaseImpl buscaFuncionarioUseCaseImpl(
            BuscarFuncionarioImpl buscarFuncionarioPorId
    ) {
        return new BuscaFuncionarioUseCaseImpl(buscarFuncionarioPorId);
    }

}
