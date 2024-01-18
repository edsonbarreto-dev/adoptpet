package br.com.fiap.pettech.pettech.core.domain.funcionario;

public class Funcionario extends Pessoa{
    private String CPF;

    public Funcionario(String nome, String CPF) {
        super(nome);
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
