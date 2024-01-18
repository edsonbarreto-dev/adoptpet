package br.com.fiap.pettech.pettech.config.funcionario;

import br.com.fiap.pettech.pettech.core.usecase.funcionario.impl.InserirFuncionarioUseCaseImpl;
import br.com.fiap.pettech.pettech.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.fiap.pettech.pettech.dataprovider.InserirFuncionarioImpl;
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
