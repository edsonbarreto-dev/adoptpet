package br.com.adoptpet.config.solicitacao;

import br.com.adoptpet.dataprovider.BuscarSolicitacaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.core.usecase.solicitacao_adocao.impl.BuscarSolicitacaoAdocaoUseCaseImpl;

@Configuration
public class BuscarSolicitacaoUseCaseImplConfig {

    @Bean
    public BuscarSolicitacaoAdocaoUseCaseImpl buscarSolicitacaoAdocaoUseCaseImpl(
            BuscarSolicitacaoImpl buscarSolicitacaoImpl
    ) {
        return new BuscarSolicitacaoAdocaoUseCaseImpl(buscarSolicitacaoImpl);
    }
}
