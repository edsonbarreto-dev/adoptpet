package br.com.adoptpet.config.ong;

import br.com.adoptpet.core.dataprovider.ong.BuscarOngPorId;
import br.com.adoptpet.core.usecase.funcionario.BuscaFuncionarioPorIdUseCase;
import br.com.adoptpet.core.usecase.funcionario.impl.AlterarFuncionarioUseCaseImpl;
import br.com.adoptpet.core.usecase.ong.BuscarOngPorIdUseCase;
import br.com.adoptpet.core.usecase.ong.impl.AlterarOngUseCaseImpl;
import br.com.adoptpet.dataprovider.AlterarOngImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlterarOngConfig {
    @Bean
    public AlterarOngUseCaseImpl alterarOngUseCase(
            BuscarOngPorId buscarOngPorId,
            AlterarOngImpl alterarOng
    ) {
        return new AlterarOngUseCaseImpl
                ((BuscarOngPorIdUseCase) buscarOngPorId, alterarOng);
    }
}
