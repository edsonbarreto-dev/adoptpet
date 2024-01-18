package br.com.fiap.pettech.pettech.services;

import br.com.fiap.pettech.pettech.dataprovider.repository.entity.Ong;
import br.com.fiap.pettech.pettech.dataprovider.repository.OngRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OngService {
    @Autowired
    private OngRepository ongRepository;

    public List<Ong> listAll(){
        return ongRepository.findAll();
    }

    public Optional<Ong> findById(Long id){
        return ongRepository.findById(id);
    }

    public Ong save(Ong ong){
        return ongRepository.save(ong);
    }
}
