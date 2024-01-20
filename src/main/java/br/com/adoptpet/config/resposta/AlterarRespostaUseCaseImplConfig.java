package br.com.adoptpet.config.resposta;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.adoptpet.dataprovider.AlterarSolicitacaoImpl;
import br.com.adoptpet.core.usecase.solicitacao.impl.AlterarSolicitacaoUseCaseImpl;

@Configuration
public class AlterarRespostaUseCaseImplConfig {

    @Bean
    public AlterarSolicitacaoUseCaseImpl alterarSolicitacaoUseCase(
            AlterarSolicitacaoImpl alterarSolicitacao
    ) {
        return new AlterarSolicitacaoUseCaseImpl(alterarSolicitacao);
    }
}
