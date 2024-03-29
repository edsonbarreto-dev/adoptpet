package br.com.adoptpet.config.funcionario;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.AlterarFuncionarioImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioImpl;
import br.com.adoptpet.core.usecase.funcionario.impl.AlterarFuncionarioUseCaseImpl;

@Configuration
public class AlterarFuncionarioUseCaseImplConfig {
    @Bean
    public AlterarFuncionarioUseCaseImpl alterarFuncionarioUseCaseImpl(
            BuscarFuncionarioImpl buscarFuncionarioPorId,
            BuscarEnderecoPorCepImpl buscarCep,
            AlterarFuncionarioImpl alterarFuncionario
    ) {
        return new AlterarFuncionarioUseCaseImpl(buscarFuncionarioPorId, buscarCep, alterarFuncionario);
    }
}
