package br.com.fiap.pettech.pettech.config;

import br.com.fiap.pettech.pettech.core.dataprovider.BuscarFuncionarioPorId;
import br.com.fiap.pettech.pettech.core.usecase.BuscaFuncionarioPorIdUseCase;
import br.com.fiap.pettech.pettech.core.usecase.impl.BuscaFuncionarioPorIdUseCaseImpl;
import br.com.fiap.pettech.pettech.core.usecase.impl.ExcluirFuncionarioPorIdUseCaseImpl;
import br.com.fiap.pettech.pettech.dataprovider.BuscarFuncionarioPorIdImpl;
import br.com.fiap.pettech.pettech.dataprovider.ExcluirFuncionarioPorIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcluirFuncionarioConfig {

    @Bean
    public ExcluirFuncionarioPorIdUseCaseImpl excluirFuncionarioPorIdUseCase(
            BuscarFuncionarioPorIdImpl buscarFuncionarioPorId,
            ExcluirFuncionarioPorIdImpl excluirFuncionarioPorId) {
        return new ExcluirFuncionarioPorIdUseCaseImpl((BuscaFuncionarioPorIdUseCase) buscarFuncionarioPorId, excluirFuncionarioPorId);
    }
}
