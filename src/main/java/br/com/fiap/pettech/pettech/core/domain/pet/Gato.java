package br.com.fiap.pettech.pettech.core.domain.pet;

public class Gato extends Pet {

    public Gato(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
