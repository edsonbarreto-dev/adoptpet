package br.com.fiap.pettech.pettech.config.funcionario;

import br.com.fiap.pettech.pettech.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;
import br.com.fiap.pettech.pettech.core.usecase.funcionario.impl.AlterarFuncionarioUseCaseImpl;
import br.com.fiap.pettech.pettech.dataprovider.AlterarFuncionarioImpl;
import br.com.fiap.pettech.pettech.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.fiap.pettech.pettech.dataprovider.BuscarFuncionarioPorIdImpl;
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
        return new AlterarFuncionarioUseCaseImpl
                ((BuscaFuncionarioPorIdUseCase) buscarFuncionarioPorId, buscarCep, alterarFuncionario);
    }
}
