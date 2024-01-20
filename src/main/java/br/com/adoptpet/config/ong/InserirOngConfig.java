package br.com.adoptpet.config.ong;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.core.usecase.ong.impl.InserirOngUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.adoptpet.dataprovider.InserirOngImpl;

@Configuration
public class InserirOngConfig {
     @Bean
    public InserirOngUseCaseImpl inserirOngUseCaseImpl(
         InserirOngImpl inserirOngImpl,
         BuscarEnderecoPorCepImpl buscarEnderecoPorCepImpl

    ) {
        return new InserirOngUseCaseImpl(inserirOngImpl, buscarEnderecoPorCepImpl);
    }
}
