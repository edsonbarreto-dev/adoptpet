package br.com.adoptpet.core.domain.ong;

import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.TipoPessoa;

public class Ong extends Pessoa {
    private final String CNPJ;

    public Ong(String nome, String CNPJ) {
        super(nome);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    @Override
    public void setTipoPessoa() {
        this.tipoPessoa = TipoPessoa.JURIDICA;
    }
}
