package br.com.adoptpet.config.resposta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.ExcluirRespostaImpl;
import br.com.adoptpet.core.usecase.resposta.impl.ExcluirRespostaUseCaseImpl;

@Configuration
public class ExcluirRespostaUseCaseImplConfig {

    @Bean
    public ExcluirRespostaUseCaseImpl excluirRespostaUseCaseImpl(
            ExcluirRespostaImpl excluirRespostaImpl
    ) {
        return new ExcluirRespostaUseCaseImpl(excluirRespostaImpl);
    }
}
