package com.example.atividadeCICD;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraServiceTest {

    @Test
    public void testAdd() {
        CalculadoraService calculadora = new CalculadoraService();
        int resultado = calculadora.add(2, 3);
        assertEquals(5, resultado);
    }
}