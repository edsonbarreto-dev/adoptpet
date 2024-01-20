package br.com.adoptpet.config.funcionario;

import br.com.adoptpet.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;
import br.com.adoptpet.core.usecase.funcionario.impl.AlterarFuncionarioUseCaseImpl;
import br.com.adoptpet.dataprovider.AlterarFuncionarioImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioPorIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlterarFuncionarioConfig {
    @Bean
    public AlterarFuncionarioUseCaseImpl alterarFuncionarioUseCase(
            BuscarFuncionarioPorIdImpl buscarFuncionarioPorId,
            BuscarEnderecoPorCepImpl buscarCep,
            AlterarFuncionarioImpl alterarFuncionario
    ) {
        return new AlterarFuncionarioUseCaseImpl(buscarFuncionarioPorId, buscarCep, alterarFuncionario);
    }
}
