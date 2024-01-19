package br.com.adoptpet.dataprovider.repository.entity;

import br.com.adoptpet.core.domain.shared.TipoPessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="funcionario")
public class FuncionarioEntity extends PessoaEntity{
    private String CPF;

    public FuncionarioEntity(String nome, String CPF) {
        super(nome);
        this.CPF = CPF;
    }

    public FuncionarioEntity() {}

    public String getCPF() { return CPF; }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public void setTipoPessoa() {
        this.tipoPessoa = TipoPessoa.FISICA;
    }

}
