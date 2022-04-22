package com.exemplo.exemplificando;

import com.exemplo.model.Cliente;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CadastroCliente {
    public static void main(String[] args) {
        Cliente c = new Cliente("Lucas Magno", LocalDate.of(2002, Month.FEBRUARY,26));

        //Saber a diferença entre a datas, usado para saber a idade do usuario
        int idade = Period.between(c.getDataNascimento(), LocalDate.now()).getYears();

        if(idade >= 18){
            System.out.println("OK, Pode ser cadastrado. Idade: " + idade);
        }else{
            System.err.println("O usuário precisa ter pelo menos 18 anos, sua idade é " + idade + " anos.");
        }
    }
}
