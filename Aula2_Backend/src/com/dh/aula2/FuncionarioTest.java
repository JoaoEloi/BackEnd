package com.dh.aula2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void Calculos() {

        Funcionario funcionario = new Efetivo("Odair", "Antunes", "55201", 3000, 1000, 500.0);

        funcionario.pagamentoSalario();

        Funcionario funcionario1 = new Contratado("Marlene", "Peixoto", "41528", 1000.0, 50);

        funcionario1.pagamentoSalario();
    }

}