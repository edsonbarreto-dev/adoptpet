package br.com.adoptpet.config.funcionario;

import br.com.adoptpet.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;
import br.com.adoptpet.core.usecase.funcionario.impl.ExcluirFuncionarioPorIdUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioPorIdImpl;
import br.com.adoptpet.dataprovider.ExcluirFuncionarioPorIdImpl;
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
