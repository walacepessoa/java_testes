package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.example.JavaTestes.*;
import static org.junit.jupiter.api.Assertions.*;

public class JavaTestesTest {

    @Test
    void testTresLetras() {
        char[] entrada = {'a', 'b', 'c'};
        List<String> resultado = gerarAnagramas(entrada);
        assertEquals(6, resultado.size());
        assertTrue(resultado.contains("abc"));
    }

    @Test
    void testUmaLetra() {
        char[] entrada = {'x'};
        List<String> resultado = gerarAnagramas(entrada);
        assertEquals(1, resultado.size());
        assertEquals("x", resultado.get(0));
    }

    @Test
    void testEntradaVazia() {
        char[] entrada = {};
        Exception ex = assertThrows(IllegalArgumentException.class, () -> gerarAnagramas(entrada));
        assertEquals("Input não pode ser vazio.", ex.getMessage());
    }
}