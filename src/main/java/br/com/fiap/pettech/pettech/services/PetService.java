package br.com.fiap.pettech.pettech.services;

import br.com.fiap.pettech.pettech.entity.Ong;
import br.com.fiap.pettech.pettech.entity.Pet;
import br.com.fiap.pettech.pettech.repository.FamiliaRespository;
import br.com.fiap.pettech.pettech.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PetService {
    @Autowired
    private PetRepository petRepository;

    public List<Pet> listAll(){
        return petRepository.findAll();
    }

    public Optional<Pet> findById(Long id){
        return petRepository.findById(id);
    }

    public Pet save(Pet pet){
        return petRepository.save(pet);
    }
}
