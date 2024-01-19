package br.com.adoptpet.dataprovider.repository.vo;

import lombok.Data;

@Data
public class FuncionarioVO {
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
}
