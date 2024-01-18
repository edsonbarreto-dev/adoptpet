package br.com.fiap.pettech.pettech.config.funcionario;


import br.com.fiap.pettech.pettech.core.dataprovider.funcionario.BuscarFuncionarioPorId;
import br.com.fiap.pettech.pettech.core.usecase.funcionario.impl.BuscaFuncionarioPorIdUseCaseImpl;

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
