package br.com.main.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {
    @Test
    void testNaoDeveriaCriarCPFInvalid() {
        assertThrows(IllegalArgumentException.class, () -> new CPF("094.755.14"));
        assertThrows(IllegalArgumentException.class, () -> new CPF(null));
        assertThrows(IllegalArgumentException.class, () -> new CPF("abc.abc.abc-ab"));
        assertThrows(IllegalArgumentException.class, () -> new CPF("089.ab4.4g2-a5"));
    }

    @Test
    void testDeveriaCriarCPFValido(){
        assertEquals("122.122.421-23", new CPF("122.122.421-23").getCpf());
        assertEquals("12212242123", new CPF("12212242123").getCpf());
        assertEquals("122122421-23", new CPF("122122421-23").getCpf());
        assertEquals("122.122421-23", new CPF("122.122421-23").getCpf());
        assertEquals("122122.421-23", new CPF("122122.421-23").getCpf());
    }
}