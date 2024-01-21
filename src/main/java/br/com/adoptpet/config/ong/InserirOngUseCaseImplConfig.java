package br.com.adoptpet.config.ong;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.core.usecase.ong.impl.InserirOngCaseImpl;
import br.com.adoptpet.dataprovider.BuscarEnderecoPorCepImpl;
import br.com.adoptpet.dataprovider.InserirOngImpl;

@Configuration
public class InserirOngUseCaseImplConfig {
     @Bean
    public InserirOngCaseImpl inserirOngCaseImpl(
         InserirOngImpl inserirOngImpl,
         BuscarEnderecoPorCepImpl buscarEnderecoPorCepImpl
    ) {
        return new InserirOngCaseImpl(inserirOngImpl, buscarEnderecoPorCepImpl);
    }
}
