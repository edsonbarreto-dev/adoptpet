package br.com.adoptpet.config.solicitacao;

import br.com.adoptpet.core.usecase.solicitacao.BuscarSolicitacaoPorNumeroUseCase;
import br.com.adoptpet.core.usecase.solicitacao.impl.AlterarSolicitacaoUseCaseImpl;
import br.com.adoptpet.dataprovider.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlterarSolicitacaoConfig {

    @Bean
    public AlterarSolicitacaoUseCaseImpl alterarSolicitacaoUseCase(
            BuscarSolicitacaoPorNumeroImpl buscarSolicitacaoPorNumero,
            AlterarSolicitacaoImpl alterarSolicitacao
    ) {
        return new AlterarSolicitacaoUseCaseImpl
                ((BuscarSolicitacaoPorNumeroUseCase) buscarSolicitacaoPorNumero, alterarSolicitacao);
    }
}
