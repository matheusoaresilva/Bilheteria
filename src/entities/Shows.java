package Bilheteria.src.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Shows {
    private String nome;
    private LocalDate data;
    private LocalTime hora;
    private Double preco;
    private Integer qtdDisponivel;

    public Shows(String nome, LocalDate data, LocalTime hora, Double preco, Integer qtdDisponivel) {
        this.nome = nome;
        this.data = data;
        this.hora = hora;
        this.preco = preco;
        this.qtdDisponivel = qtdDisponivel;
    }

    public Shows(String nome) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(Integer qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    @Override
    public String toString() {
        return "Nome: "+ nome + ", Data: " + data + ", Horario: "+ hora + ", Preço: "+preco + ", quantidade disponivel "+ qtdDisponivel;
    }
}
