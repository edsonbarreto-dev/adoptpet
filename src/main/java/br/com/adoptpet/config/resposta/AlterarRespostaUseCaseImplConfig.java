package br.com.adoptpet.config.resposta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.AlterarRespostaImpl;
import br.com.adoptpet.core.usecase.resposta.impl.AlterarRespostaUseCaseImpl;

@Configuration
public class AlterarRespostaUseCaseImplConfig {

    @Bean
    public AlterarRespostaUseCaseImpl alterarRespostaUseCaseImpl(
            AlterarRespostaImpl alterarRespostaImpl
    ) {
        return new AlterarRespostaUseCaseImpl(alterarRespostaImpl);
    }
}
