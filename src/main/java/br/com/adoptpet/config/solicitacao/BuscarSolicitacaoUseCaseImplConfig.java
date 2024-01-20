package br.com.adoptpet.config.solicitacao;

import br.com.adoptpet.dataprovider.BuscarSolicitacaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.core.usecase.solicitacao.impl.BuscarSolicitacaoUseCaseImpl;

@Configuration
public class BuscarSolicitacaoUseCaseImplConfig {

    @Bean
    public BuscarSolicitacaoUseCaseImpl alterarSolicitacaoUseCase(
            BuscarSolicitacaoImpl buscarSolicitacaoImpl
    ) {
        return new BuscarSolicitacaoUseCaseImpl(buscarSolicitacaoImpl);
    }
}
