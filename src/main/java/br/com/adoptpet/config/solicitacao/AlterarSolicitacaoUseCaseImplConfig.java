package br.com.adoptpet.config.solicitacao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.AlterarSolicitacaoImpl;
import br.com.adoptpet.core.usecase.solicitacao.impl.AlterarSolicitacaoUseCaseImpl;

@Configuration
public class AlterarSolicitacaoUseCaseImplConfig {

    @Bean
    public AlterarSolicitacaoUseCaseImpl alterarSolicitacaoUseCase(
            AlterarSolicitacaoImpl alterarSolicitacaoImpl
    ) {
        return new AlterarSolicitacaoUseCaseImpl(alterarSolicitacaoImpl);
    }
}
