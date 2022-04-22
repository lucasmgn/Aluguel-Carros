package com.exemplo.exemplificando;

import com.exemplo.model.Carro;

import java.lang.reflect.Array;
import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class CadastroCarro {
    public static void main(String[] args) {

        Carro gol = new Carro("Gol", 90.90, Year.of(2012));
        Carro cruze = new Carro("Cruze", 120.00, Year.parse("2013"));
        Carro celta = new Carro("Celta", 80.00, Year.of(2011));

        List<Carro> carros = Arrays.asList(gol, cruze, celta);
        carros.stream()                             // isAfter(Year.of(2012)) saber se o ano de fabricação é maior que 2012
                .filter(c -> c.getAnoFabricacao().isAfter(Year.of(2012)))
                .forEach(c -> System.out.println(c.getModelo()));
    }
}
