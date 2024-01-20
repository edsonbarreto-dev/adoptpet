package br.com.adoptpet.config.funcionario;

import br.com.adoptpet.core.usecase.funcionario.impl.ExcluirFuncionarioPorIdUseCaseImpl;
import br.com.adoptpet.core.usecase.funcionario.impl.ExcluirFuncionarioUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioPorIdImpl;
import br.com.adoptpet.dataprovider.ExcluirFuncionarioImpl;
import br.com.adoptpet.dataprovider.ExcluirFuncionarioPorIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcluirFuncionarioUseCaseImplConfig {

    @Bean
    public ExcluirFuncionarioUseCaseImpl excluirFuncionarioPorIdUseCase(
            ExcluirFuncionarioImpl excluirFuncionario
    ) {
        return new ExcluirFuncionarioUseCaseImpl(excluirFuncionario);
    }
}
