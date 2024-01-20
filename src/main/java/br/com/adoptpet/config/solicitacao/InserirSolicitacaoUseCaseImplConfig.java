package br.com.adoptpet.config.solicitacao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.InserirSolicitacaoImpl;
import br.com.adoptpet.core.usecase.solicitacao.impl.InserirSolicitacaoUseCaseImpl;

@Configuration
public class InserirSolicitacaoUseCaseImplConfig {

    @Bean
    public InserirSolicitacaoUseCaseImpl incluirSolicitacaoUseCase(
            InserirSolicitacaoImpl incluirSolicitacaoImpl
    ) {
        return new InserirSolicitacaoUseCaseImpl(incluirSolicitacaoImpl);
    }
}
