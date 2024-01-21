package br.com.adoptpet.core.domain.pet;

import br.com.adoptpet.core.domain.shared.SexoPetEnum;
import br.com.adoptpet.core.domain.shared.StatusPetEnum;

public abstract class Pet {
    protected final String nome;
    protected final String raca;
    protected int idade;
    protected int expectativaDeVida;
    protected double peso;
    protected double altura;
    protected String registro;
    protected String corDoPelo = "Não informado";
    protected String corDosOlhos = "Não informado";
    protected String porte;
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
