package br.com.adoptpet.config.solicitacao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.InserirSolicitacaoImpl;
import br.com.adoptpet.core.usecase.solicitacao_adocao.impl.InserirSolicitacaoAdocaoUseCaseImpl;

@Configuration
public class InserirSolicitacaoUseCaseImplConfig {

    @Bean
    public InserirSolicitacaoAdocaoUseCaseImpl inserirSolicitacaoAdocaoUseCaseImpl(
            InserirSolicitacaoImpl incluirSolicitacaoImpl
    ) {
        return new InserirSolicitacaoAdocaoUseCaseImpl(incluirSolicitacaoImpl);
    }
}
