package br.com.fiap.pettech.pettech.dataprovider.repository.entity;

public class CachorroEntity extends PetEntity {

    private String registro;

    public CachorroEntity(String nome, String raca, String registro) {
        super(nome, raca);
        this.registro = registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }
}
