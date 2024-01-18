package br.com.fiap.pettech.pettech.core.domain.pet;

public abstract class Pet {
    public String registro;
    public final String nome;
    public final String raca;
    public String corDoPelo = "Não informado";
    public String corDosOlhos = "Não informado";
    public int idade;
    public int expectativaDeVida;
    public double peso;
    public double altura;

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
