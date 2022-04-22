package com.exemplo.model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Aluguel {
    private Cliente cliente;
    private Carro carro;

    private LocalDateTime dataHoraRetirada;
    private LocalDateTime dataHoraPrevistaDevolucao;
    private LocalDateTime dataHoraRealDevolucao;

    public Aluguel(Cliente cliente, Carro carro, LocalDateTime dataHoraRetirada, LocalDateTime dataHoraPrevistaDevolucao) {
        this.cliente = cliente;
        this.carro = carro;
        this.dataHoraRetirada = dataHoraRetirada;
        this.dataHoraPrevistaDevolucao = dataHoraPrevistaDevolucao;
        this.dataHoraRealDevolucao = dataHoraRealDevolucao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {

        this.carro = carro;
    }

    public LocalDateTime getDataHoraRetirada() {

        return dataHoraRetirada;
    }

    public void setDataHoraRetirada(LocalDateTime dataHoraRetirada) {

        this.dataHoraRetirada = dataHoraRetirada;
    }

    public LocalDateTime getDataHoraPrevistaDevolucao() {

        return dataHoraPrevistaDevolucao;
    }

    public void setDataHoraPrevistaDevolucao(LocalDateTime dataHoraPrevistaDevolucao) {
        this.dataHoraPrevistaDevolucao = dataHoraPrevistaDevolucao;
    }

    public LocalDateTime getDataHoraRealDevolucao() {

        return dataHoraRealDevolucao;
    }

    public void setDataHoraRealDevolucao(LocalDateTime dataHoraRealDevolucao) {
        this.dataHoraRealDevolucao = dataHoraRealDevolucao;
    }

    public void imprimeFatura() {
        Duration duration = Duration.between(dataHoraPrevistaDevolucao, dataHoraRealDevolucao);
        double multa = duration.toHours() * carro.getValorDiaria() * 0.03;
        long atraso = duration.toHours();
        int horas = dataHoraRealDevolucao.getHour();
        double totalPagarMulta = (carro.getValorDiaria() * horas) + multa;

        System.out.println(">>>>>>>>>>>>>>> Fatura <<<<<<<<<<<<<<<<<<<<");
        if(!duration.isNegative()) {
            System.out.println(" ");
            System.out.printf("Dias de atraso: %d dias.\n\nValor da multa: R$ %.2f.\n", atraso, multa);
            System.out.printf("\nValor total a pagar: R$ %.2f.\n", totalPagarMulta);
            System.out.println(" ");
            System.out.println("===========================================");
        }else{
            System.out.println(" ");
            System.out.println("\nValor total a pagar: R$ " + totalPagarMulta);
            System.out.println(" ");
            System.out.println("Obrigado, você foi pontual!!");
            System.out.println("===========================================");
        }
    }
}
