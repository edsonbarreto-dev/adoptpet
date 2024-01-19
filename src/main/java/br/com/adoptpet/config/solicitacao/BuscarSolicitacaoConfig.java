package br.com.adoptpet.config.solicitacao;

import br.com.adoptpet.core.dataprovider.shared.BuscarPorId;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.usecase.funcionario.impl.BuscaFuncionarioPorIdUseCaseImpl;
import br.com.adoptpet.core.usecase.solicitacao.impl.BuscarSolicitacaoUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioPorIdImpl;
import br.com.adoptpet.dataprovider.BuscarSolicitacaoPorNumeroImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarSolicitacaoConfig {
    @Bean
    public BuscarSolicitacaoUseCaseImpl solicitacaoUseCase(
            BuscarSolicitacaoPorNumeroImpl buscarSolicitacaoPorNumero) {
        return new BuscarSolicitacaoUseCaseImpl( buscarSolicitacaoPorNumero);
    }
}
