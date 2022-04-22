package com.exemplo.exemplificando;

import com.exemplo.model.Aluguel;
import com.exemplo.model.Carro;
import com.exemplo.model.Cliente;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class NovoAluguel {
    public static void main(String[] args) {
        Cliente c = new Cliente("Lucas Magno", LocalDate.of(2002, Month.FEBRUARY,26));
        Carro carro = new Carro("Gol", 90.90, Year.of(2012));

        //Passando data e hora do momento da retirada do carro, a hora sempre vai ser XX:00;
        LocalDateTime dataHoraRetirada = LocalDateTime.of(LocalDate.now(),
                LocalTime.of(LocalTime.now().getHour(),0));

        ////Passando data e hora do momento que o carro deve ser entregue 3 dias 2hrs depois da retirada, a hora sempre vai ser XX:00;
        LocalDateTime dataHoraPrevistaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

        Aluguel aluguel = new Aluguel(c, carro, dataHoraRetirada, dataHoraPrevistaDevolucao);

        imprimirRecibo(aluguel);
    }

    private static void imprimirRecibo(Aluguel aluguel){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println(" ");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> RECIBO <<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println(" ");

        System.out.println("Carro: " + aluguel.getCarro().getModelo());
        System.out.println("Cliente: " + aluguel.getCliente().getNome());
        System.out.println("Data e Hora da retirada: " + aluguel.getDataHoraRetirada().format(formatter));
        System.out.println("Data e Hora prevista para devolução: " + aluguel.getDataHoraPrevistaDevolucao().format(formatter));
        System.out.println(" ");

        System.out.println("OBS: Para cada hora de atraso, o cliente paga 3% do valor do carro em multa.");

        System.out.println(" ");
        System.out.println(">>>>>>>>>>>>>>>> OBRIGADO PELA PREFERÊNCIA <<<<<<<<<<<<<<<<");
        System.out.println(" ");
    }
}
