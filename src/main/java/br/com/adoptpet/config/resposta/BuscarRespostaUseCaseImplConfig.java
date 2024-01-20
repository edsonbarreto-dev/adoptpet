package br.com.adoptpet.config.resposta;

import br.com.adoptpet.core.usecase.resposta.impl.BuscarRespostaUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.BuscarRespostaImpl;

@Configuration
public class BuscarRespostaUseCaseImplConfig {
     @Bean
    public BuscarRespostaUseCaseImpl buscarRespostaUseCaseImpl(
         BuscarRespostaImpl buscarRespostaImpl
    ) {
        return new BuscarRespostaUseCaseImpl(buscarRespostaImpl);
    }
}
