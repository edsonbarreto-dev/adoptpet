package br.com.adoptpet.config.adotante;

import br.com.adoptpet.core.usecase.adotante.ExcluirAdotanteUseCase;
import br.com.adoptpet.core.usecase.adotante.impl.ExcluirAdotanteUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExcluirAdotanteUseCaseImplConfig {

    @Bean
    public ExcluirAdotanteUseCaseImpl excluirAdotanteUseCaseImpl(
            ExcluirAdotanteUseCase excluirAdotanteUseCase
    ) {
        return new ExcluirAdotanteUseCaseImpl(excluirAdotanteUseCase);
    }

}
