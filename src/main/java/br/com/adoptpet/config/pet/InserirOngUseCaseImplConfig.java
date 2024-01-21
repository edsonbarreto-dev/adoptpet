package br.com.adoptpet.config.pet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.InserirOngImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.adoptpet.core.usecase.ong.impl.InserirOngUseCaseImpl;

@Configuration
public class InserirOngUseCaseImplConfig {
     @Bean
    public InserirOngUseCaseImpl inserirOngUseCaseImpl(
         InserirOngImpl inserirOngImpl,
         BuscarEnderecoPorCepImpl buscarEnderecoPorCepImpl
    ) {
        return new InserirOngUseCaseImpl(inserirOngImpl, buscarEnderecoPorCepImpl);
    }
}
