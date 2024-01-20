package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.ong.ExcluirOngPorId;
import br.com.adoptpet.dataprovider.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExcluirOngPorIdImpl implements ExcluirOngPorId {

    @Autowired
    private OngRepository repository;

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
