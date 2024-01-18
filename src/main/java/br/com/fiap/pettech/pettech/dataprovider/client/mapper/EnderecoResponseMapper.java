package br.com.fiap.pettech.pettech.dataprovider.client.mapper;

import br.com.fiap.pettech.pettech.core.shared.Endereco;
import br.com.fiap.pettech.pettech.dataprovider.client.response.EnderecoResponse;
import org.apache.ibatis.annotations.Mapper;

//import org.mapstruct.Mapper;

@Mapper
public interface EnderecoResponseMapper {

    Endereco toAddress(EnderecoResponse enderecoResponse);

}
