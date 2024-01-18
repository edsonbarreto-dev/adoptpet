package br.com.fiap.pettech.pettech.config;


import br.com.fiap.pettech.pettech.core.dataprovider.BuscarFuncionarioPorId;
import br.com.fiap.pettech.pettech.core.usecase.impl.BuscaFuncionarioPorIdUseCaseImpl;

import br.com.fiap.pettech.pettech.dataprovider.BuscarFuncionarioPorIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarFuncionarioConfig {

    @Bean
    public BuscaFuncionarioPorIdUseCaseImpl funcionarioPorIdUseCase(
            BuscarFuncionarioPorIdImpl buscarFuncionarioPorId) {
        return new BuscaFuncionarioPorIdUseCaseImpl((BuscarFuncionarioPorId) buscarFuncionarioPorId);
    }

}
