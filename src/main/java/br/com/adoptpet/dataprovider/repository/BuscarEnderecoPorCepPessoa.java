package br.com.adoptpet.dataprovider.repository;

import br.com.adoptpet.core.domain.shared.Endereco;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

/*No curso ele faz esta anotação que eu não configurei
@FeignClient(
    name = "BuscarEnderecoPorCepPessoaImpl",
    url = "${arantes.client.address.url}"
)*/
public interface BuscarEnderecoPorCepPessoa {

    @GetMapping("/{cep}")
    Optional<Endereco> find(@PathVariable("cep") String cep);

}
