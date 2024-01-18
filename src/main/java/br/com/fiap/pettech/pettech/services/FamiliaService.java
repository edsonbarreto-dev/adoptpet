package br.com.fiap.pettech.pettech.services;

import br.com.fiap.pettech.pettech.entity.Familia;
import br.com.fiap.pettech.pettech.entity.Ong;
import br.com.fiap.pettech.pettech.repository.FamiliaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamiliaService {

    @Autowired
    private FamiliaRespository familiaRepository;

    public List<Familia> listAll(){
        return familiaRepository.findAll();
    }

    public Optional<Familia> findById(Long id){
        return familiaRepository.findById(id);
    }

    public Familia save(Familia familia){
        return familiaRepository.save(familia);
    }
}
