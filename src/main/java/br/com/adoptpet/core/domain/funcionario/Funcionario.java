package br.com.adoptpet.core.domain.funcionario;

import br.com.adoptpet.core.domain.shared.Endereco;
import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.TipoPessoa;

public class Funcionario extends Pessoa {
    private String CPF;

    public Funcionario(String nome, String CPF) {
        super(nome);
        this.CPF = CPF;
    }

    public Funcionario(Long id, String nome, String telefone, String email, Endereco endereco, TipoPessoa tipoPessoa, String CPF) {
        super(id, nome, telefone, email, endereco, tipoPessoa);
        this.CPF = CPF;
    }

    public Funcionario(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public void setTipoPessoa() {
        this.tipoPessoa = TipoPessoa.FISICA;
    }
}
