package br.com.adoptpet.config.funcionario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import br.com.adoptpet.dataprovider.InserirFuncionarioImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.adoptpet.core.usecase.funcionario.impl.InserirFuncionarioUseCaseImpl;

@Configuration
public class InserirFuncionarioUseCaseImplConfig {
    @Bean
    public InserirFuncionarioUseCaseImpl inserirFuncionarioUseCase(
            BuscarEnderecoPorCepImpl buscarEnderecoPorCepImpl,
            InserirFuncionarioImpl inserirFuncionarioImpl
    ) {
        return new InserirFuncionarioUseCaseImpl(buscarEnderecoPorCepImpl, inserirFuncionarioImpl);
    }
}
