package br.com.adoptpet.core.domain.adotante;

import br.com.adoptpet.core.domain.shared.Pessoa;
import br.com.adoptpet.core.domain.shared.TipoPessoa;

public class Adotante extends Pessoa {
    private String genero;
    private int idade;

    public Adotante(String nome, String genero, int idade) {
        super(nome);
        this.genero = genero;
        this.idade = idade;
    }

    public Adotante() {}

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void setTipoPessoa() {
        this.tipoPessoa = TipoPessoa.FISICA;
    }
}
