package br.com.fiap.pettech.pettech.services;

import br.com.fiap.pettech.pettech.dataprovider.repository.entity.Endereco;
import br.com.fiap.pettech.pettech.dataprovider.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> listAll(){
        return enderecoRepository.findAll();
    }

    public Optional<Endereco> findById(Long id){
        return enderecoRepository.findById(id);
    }

    public Endereco save(Endereco endereco){
        return enderecoRepository.save(endereco);
    }
}
