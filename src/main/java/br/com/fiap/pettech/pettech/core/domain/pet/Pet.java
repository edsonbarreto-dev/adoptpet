package br.com.fiap.pettech.pettech.core.domain.pet;

import br.com.fiap.pettech.pettech.core.shared.SexoPetEnum;
import br.com.fiap.pettech.pettech.core.shared.StatusPetEnum;

public abstract class Pet {
    protected String registro;
    protected final String nome;
    protected final String raca;
    protected String corDoPelo = "Não informado";
    protected String corDosOlhos = "Não informado";
    protected int idade;
    protected int expectativaDeVida;
    protected String porte;
    protected double peso;
    protected double altura;
    protected SexoPetEnum sexo;
    protected StatusPetEnum status;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public abstract void setRegistro(String registro);

    public String getRegistro() {
        return registro;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public int getExpectativaDeVida() {
        return expectativaDeVida;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public void setExpectativaDeVida(int expectativaDeVida) {
        this.expectativaDeVida = expectativaDeVida;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
