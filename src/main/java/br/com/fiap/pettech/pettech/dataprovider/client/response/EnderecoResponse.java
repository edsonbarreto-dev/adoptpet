package br.com.fiap.pettech.pettech.dataprovider.client.response;

import lombok.Data;

@Data
public class EnderecoResponse {
    private String logradouro;

    private String cidade;

    private String estado;
}
