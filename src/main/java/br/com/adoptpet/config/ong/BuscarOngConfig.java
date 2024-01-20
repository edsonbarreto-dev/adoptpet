package br.com.adoptpet.config.ong;


import br.com.adoptpet.core.dataprovider.shared.BuscarPorId;
import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.usecase.ong.impl.BuscarOngUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BuscarOngConfig {

    private BuscarPorId<Ong> buscarPorId;

    @Bean
    public BuscarOngUseCaseImpl ongPorIdUseCase(BuscarPorId<Ong> buscarPorId) {
        this.buscarPorId = buscarPorId;
        return new BuscarOngUseCaseImpl(buscarPorId);
    }

}
