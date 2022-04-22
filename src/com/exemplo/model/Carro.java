package com.exemplo.model;

import java.time.LocalDate;
import java.time.Year;

public class Carro {
    private String modelo;
    private double valorDiaria;

    public Carro(String modelo, double valorDiaria, Year anoFabricacao) {
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Year getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Year anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    private Year anoFabricacao;
}
