package br.com.fiap.pettech.pettech.core.domain.ong;

public class Ong extends Pessoa{

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
