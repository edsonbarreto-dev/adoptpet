package br.com.adoptpet.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.dataprovider.ong.InserirOng;
import br.com.adoptpet.dataprovider.repository.OngRepository;
import br.com.adoptpet.dataprovider.repository.mapper.OngEntityMapper;

@Component
public class InserirOngImpl implements InserirOng {
    @Autowired
    private OngRepository ongRepository;
    @Autowired
    private OngEntityMapper ongEntityMapper;

    @Override
    public void insert(Ong ong) {
        var ongEntity = ongEntityMapper.toOngEntity(ong);
        ongRepository.save(ongEntity);
    }
}
