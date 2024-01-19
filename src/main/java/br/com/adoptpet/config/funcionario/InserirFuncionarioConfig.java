package br.com.adoptpet.config.funcionario;

import br.com.adoptpet.core.usecase.funcionario.impl.InserirFuncionarioUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.adoptpet.dataprovider.InserirFuncionarioImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirFuncionarioConfig {
     @Bean
        public InserirFuncionarioUseCaseImpl inserirFuncionarioUseCase(
                BuscarEnderecoPorCepImpl buscarCep,
                InserirFuncionarioImpl inserirFuncionario

        ) {
            return new InserirFuncionarioUseCaseImpl
                    (buscarCep, inserirFuncionario);
        }

    }
