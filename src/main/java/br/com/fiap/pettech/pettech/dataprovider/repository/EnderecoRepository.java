package br.com.fiap.pettech.pettech.dataprovider.repository;

import br.com.fiap.pettech.pettech.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
