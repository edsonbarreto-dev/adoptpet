package br.com.adoptpet.config.resposta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.InserirRespostaImpl;
import br.com.adoptpet.core.usecase.resposta.impl.InserirRespostaUseCaseImpl;

@Configuration
public class InserirRespostaUseCaseImplConfig {
     @Bean
    public InserirRespostaUseCaseImpl inserirRespostaUseCaseImpl(
         InserirRespostaImpl inserirRespostaImpl
    ) {
        return new InserirRespostaUseCaseImpl(inserirRespostaImpl);
    }
}
