package br.com.adoptpet.dataprovider;

import br.com.adoptpet.core.dataprovider.ong.ExcluirOng;
import br.com.adoptpet.dataprovider.repository.OngRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExcluirOngImpl implements ExcluirOng {

    @Autowired
    private OngRepository repository;

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
