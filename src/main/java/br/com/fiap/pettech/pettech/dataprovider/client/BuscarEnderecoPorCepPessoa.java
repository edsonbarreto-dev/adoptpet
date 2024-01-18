package br.com.fiap.pettech.pettech.dataprovider.client;

import br.com.fiap.pettech.pettech.dataprovider.client.response.EnderecoResponse;
import br.com.fiap.pettech.pettech.dataprovider.repository.entity.Endereco;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/*No curso ele faz esta anotação que eu não configurei
@FeignClient(
    name = "FindAddressByZipCodeClient",
    url = "${arantes.client.address.url}"
)*/
public interface BuscarEnderecoPorCepPessoa {

    @GetMapping("/{cep}")
    EnderecoResponse find(@PathVariable("cep") String cep);

}
