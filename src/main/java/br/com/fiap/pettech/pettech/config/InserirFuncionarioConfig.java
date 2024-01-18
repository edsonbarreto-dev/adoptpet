package br.com.fiap.pettech.pettech.config;

import br.com.fiap.pettech.pettech.core.dataprovider.BuscarCep;
import br.com.fiap.pettech.pettech.core.dataprovider.InserirFuncionario;
import br.com.fiap.pettech.pettech.core.usecase.impl.InserirFuncionarioUseCaseImpl;
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
