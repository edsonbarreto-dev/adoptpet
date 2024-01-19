package br.com.adoptpet.config.ong;

import br.com.adoptpet.core.usecase.funcionario.impl.InserirFuncionarioUseCaseImpl;
import br.com.adoptpet.core.usecase.ong.impl.InserirOngUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.adoptpet.dataprovider.InserirOngImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InserirOngConfig {
     @Bean
        public InserirOngUseCaseImpl inserirOngUseCaseImpl(
             BuscarEnderecoPorCepImpl buscarCep,
             InserirOngImpl inserirOng

        ) {
            return new InserirFuncionarioUseCaseImpl
                    (buscarCep, inserirOng);
        }

    }
