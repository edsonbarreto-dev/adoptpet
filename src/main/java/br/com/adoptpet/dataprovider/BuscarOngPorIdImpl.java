package br.com.adoptpet.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.adoptpet.core.domain.ong.Ong;
import br.com.adoptpet.core.dataprovider.ong.BuscarOngPorId;
import br.com.adoptpet.dataprovider.repository.OngRepository;
import br.com.adoptpet.dataprovider.repository.entity.OngEntity;
import br.com.adoptpet.dataprovider.repository.mapper.OngEntityMapper;

@Component
public class BuscarOngPorIdImpl implements BuscarOngPorId {
    @Autowired
    private OngRepository ongRepository;
    @Autowired
    private OngEntityMapper mapper;

    @Override
    public Ong find(Long id) {
        OngEntity ongEntity = ongRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Adotante não encontrado"));

        return mapper.toOng(ongEntity);
    }
}
