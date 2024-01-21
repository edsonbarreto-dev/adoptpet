package br.com.adoptpet.config.funcionario;

import br.com.adoptpet.core.usecase.funcionario.impl.ExcluirFuncionarioUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioImpl;
import br.com.adoptpet.dataprovider.ExcluirFuncionarioImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcluirFuncionarioUseCaseImplConfig {

    @Bean
    public ExcluirFuncionarioUseCaseImpl excluirFuncionarioUseCaseImpl(
            ExcluirFuncionarioImpl excluirFuncionario,
            BuscarFuncionarioImpl buscarFuncionario
    ) {
        return new ExcluirFuncionarioUseCaseImpl(buscarFuncionario, excluirFuncionario);
    }
}
