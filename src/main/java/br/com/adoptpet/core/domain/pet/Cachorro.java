package br.com.adoptpet.core.domain.pet;

public class Cachorro extends Pet {

    public Cachorro(String nome, String raca) {
        super(nome, raca);
    }

    @Override
    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
