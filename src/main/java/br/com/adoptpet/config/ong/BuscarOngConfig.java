package br.com.adoptpet.config.ong;


import br.com.adoptpet.core.dataprovider.shared.BuscarPorId;
import br.com.adoptpet.core.domain.funcionario.Funcionario;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.usecase.funcionario.impl.BuscaFuncionarioPorIdUseCaseImpl;
import br.com.adoptpet.core.usecase.ong.impl.BuscarOngUseCaseImpl;
import br.com.adoptpet.dataprovider.BuscarFuncionarioPorIdImpl;
import br.com.adoptpet.dataprovider.BuscarOngPorIdImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarOngConfig {

    @Bean
    public BuscarOngUseCaseImpl ongPorIdUseCase(
            BuscarOngPorIdImpl buscarOngPorId) {
        return new BuscarOngUseCaseImpl ((BuscarPorId<Ong>) buscarOngPorId);
    }

}
