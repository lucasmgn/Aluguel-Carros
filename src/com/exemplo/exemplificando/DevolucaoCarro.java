package com.exemplo.exemplificando;

import com.exemplo.model.Aluguel;
import com.exemplo.model.Carro;
import com.exemplo.model.Cliente;

import java.time.*;

public class DevolucaoCarro {
    public static void main(String[] args) {

        Aluguel aluguel = recuperandoAluguel();

        //Para cada hora de atraso, o cliente paga 3% do valor do carro em multa.
        LocalDateTime dataHoraRealDevolucao = LocalDateTime.of(LocalDate.now().plusDays(5), LocalTime.now());
        aluguel.setDataHoraRealDevolucao(dataHoraRealDevolucao);
        aluguel.imprimeFatura();
    }

    private static Aluguel recuperandoAluguel(){
        Cliente c = new Cliente("Lucas Magno", LocalDate.of(2002, Month.FEBRUARY,26));
        Carro carro = new Carro("Gol", 90.90, Year.of(2012));
        //Passando data e hora do momento da retirada do carro, a hora sempre vai ser XX:00;
        LocalDateTime dataHoraRetirada = LocalDateTime.of(LocalDate.now(), LocalTime.of(LocalTime.now().getHour(),0));

        ////Passando data e hora do momento que o carro deve ser entregue 3 dias 2hrs depois da retirada,
        // a hora sempre vai ser XX:00;
        LocalDateTime dataHoraPrevistaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(c, carro, dataHoraRetirada, dataHoraPrevistaDevolucao);

        return aluguel;
    }
}
