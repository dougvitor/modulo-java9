package br.com.home.java9.domain;

import br.com.home.java9.annotations.Voltage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Voltage(volts = "110")
@Voltage(volts = "220")
public class Produto {

    private final Integer codigo;
    private final String nome;
    private final Double preco;

    public Produto() {
        this.codigo = 0;
        this.nome = "";
        this.preco = 0.0;
    }

    public Produto(Integer codigo, String nome, Double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public List<String> getVolts() {
        final List<String> volts = new ArrayList<>();
        Arrays.stream(Produto.class.getAnnotationsByType(Voltage.class))
                .map(Voltage::volts)
                .forEach(volts::add);
        return volts;
    }
}
