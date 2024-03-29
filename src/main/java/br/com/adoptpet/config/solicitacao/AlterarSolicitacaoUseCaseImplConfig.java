package br.com.adoptpet.config.solicitacao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.AlterarSolicitacaoImpl;
import br.com.adoptpet.core.usecase.solicitacao_adocao.impl.AlterarSolicitacaoAdocaoUseCaseImpl;

@Configuration
public class AlterarSolicitacaoUseCaseImplConfig {

    @Bean
    public AlterarSolicitacaoAdocaoUseCaseImpl alterarSolicitacaoAdocaoUseCaseImpl(
            AlterarSolicitacaoImpl alterarSolicitacaoImpl
    ) {
        return new AlterarSolicitacaoAdocaoUseCaseImpl(alterarSolicitacaoImpl);
    }
}
